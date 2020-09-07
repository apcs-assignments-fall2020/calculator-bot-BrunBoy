import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        if (a>b && a>c && b>c){
            return b;
        }
        if (a>b && a>c && c>b){
            return c;
        }
        if (b>a && b>c && c>a){
            return c;
        }
        if (b>a && b>c && a>c){
            return a;
        }
        if (c>a && c>b && a>b){
            return a;
        }
        else{
            return b;
        }  
    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        int a2=Math.abs(a);
        int b2=Math.abs(b);
        if (a2>b2){
            return a;
        }
        else{
            return b;
        }
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        double c2=((a*a)+(b*b));
        double c=Math.sqrt(c2);
        return c;
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        final Scanner scan=new Scanner(System.in);
        System.out.println("What command would you like to carry out?");
        String papa=scan.nextLine();
        if (papa.equals("median")){
            System.out.println("What is the first number?");
            int a=scan.nextInt();
            System.out.println("What is the second number?");
            int b=scan.nextInt();
            System.out.println("What is the third number?");
            int c=scan.nextInt();
            int answer=median(a,b,c);
            System.out.println("The median is "+answer);
        }
        if (papa.equals("magnitude")){
            System.out.println("What is the first number?");
            int a=scan.nextInt();
            System.out.println("What is the second number?");
            int b=scan.nextInt();
            int answer=magnitude(a,b);
            System.out.println("The magnitude is "+answer);
        }
        else if (papa.equals("pythagoras")){
            System.out.println("What is the first number?");
            int a=scan.nextInt();
            System.out.println("What is the second number?");
            int b=scan.nextInt();
            double answer=pythagoras(a,b);
            System.out.println("C is equal to "+answer);
        }
    }
}

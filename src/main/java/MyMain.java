import java.util.Scanner;

public class MyMain {
    System.out.println("Median? Or Magnitude? Or Pythagorus?");
    Scanner theAns=new Scanner(System.in);
    String t


    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        System.out.println("What is your A value?");
        Scanner a2=new Scanner(System.in);
        int a=a2.nextInt();
        System.out.println("What is your B value?");
        Scanner b2=new Scanner(System.in);
        int b=b2.nextInt();
        System.out.println("What is your C value?");
        Scanner c2=new Scanner(System.in);
        int c=c2.nextInt();
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
        System.out.println("What is your A value?");
        Scanner a3=new Scanner(System.in);
        int a=a3.nextInt();
        System.out.println("What is your B value?");
        Scanner b3=new Scanner(System.in);
        int b=b3.nextInt();
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
        System.out.println("What is your A value?");
        Scanner a2=new Scanner(System.in);
        int a=a2.nextInt();
        System.out.println("What is your B value?");
        Scanner b2=new Scanner(System.in);
        int b=b2.nextInt();
        double c2=((a*a)+(b*b));
        double c=Math.sqrt(c2);
        return c;
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        System.out.println(median(1, 2, 3)); // should be 2
        System.out.println(magnitude(-7, -1)); // should be -7
        System.out.println(pythagoras(3, 4)); // should be 5.0

        Scanner scan = new Scanner(System.in);
        // YOUR CODE HERE
    }
}

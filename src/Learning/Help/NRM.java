package Learning.Help;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NRM {

    static final double EPSILON = 1;

    // An example function whose solution. is determined using Bisection Method.
    // The function is x^7 - 5 * x^4 + 2 * x - 17
    static double function(double x)
    {
        return x * x * x * x * x * x * x - 5 * x * x * x * x + 2 * x - 17;
    }

    // Derivative of the above function
    // which is Cos(x + Sin(x))
    static double derivativeFunction(double x)
    {
        return Math.cos(x + Math.sin(x));
    }

    // Function to find the root
    static void newtonRaphson(double x)
    {
        double h = function(x) / derivativeFunction(x);
        while (Math.abs(h) >= EPSILON)
        {
            h = function(x) / derivativeFunction(x);

            // x(i+1) = x(i) - f(x) / f'(x)
            x = x - h;
        }

        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("The value of the"
                + " root is : "
                + df.format(x));
    }

    // Driver code
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println(Math.cos(Math.sin(0.5) + 0.5));

        System.out.println("Welcome to my Java Program - Newton Raphson");
        System.out.println("(i) x ^ 7 - 5 * 4 + 2 * x - 17");
        System.out.println("Please input the value of x0 between 0 amd 1:");

        while(true){
            double x0 = scan.nextDouble();
            if(x0 >= 0 && x0 <= 1){
                System.out.println("You have input the value of x0 as: " + x0);
                newtonRaphson(x0);
            }
            System.out.println("Please input a value between 0 and 1 inclusive");
        }
    }
}

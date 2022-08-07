package Learning;

import java.util.Scanner;

public class Exercise1{

    //f(x) = x7 – 5x4 + 2x – 17 = 0
    public static double equation(double x) {
        return Math.pow(x, 7)- 5*Math.pow(x,4)+2*x-17;
    }

    //f'(x) = 7x6 - 20x3 + 2
    public static double derivativeOfEquation(double x){
        return 7*Math.pow(x,6) - 20*Math.pow(x,3) + 2;
    }

    //finding initial value of x0
    public static double find_initial_point() {

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Note: Enter points x and y where x<y and f(x) * f(y)<0 ");
            System.out.print("Enter x: ");

            double x = scanner.nextDouble();

            System.out.print("Enter y: ");

            double y;
            y = scanner.nextDouble();

            if(x < y && (equation(x)*equation(y)<0)){
                System.out.println("Root falls between x and y ");
                return ((x+y)/2);
            }else{
                System.out.println("Error");
            }

        }

    }

    public static double newtonRapsonFunction(double x){
        //Epsilon assumed.
        double EPSILON = 0.001;

        double h = equation(x) / derivativeOfEquation(x);
        while (Math.abs(h) >= EPSILON)
        {
            h = equation(x) / derivativeOfEquation(x);
            // x(i+1) = x(i) - f(x) / f'(x)
            x = x - h;
        }
        return x;
    }

    public static void main(String[] args){
        System.out.println("Our Equation is : f(x) = x7 - 5x4 + 2x - 17 = 0");
        System.out.println("Derivative of Our Equation is : f'(x) = 7x6 - 20x3 + 2 = 0");
        double x = newtonRapsonFunction(find_initial_point());
        System.out.println("The value of the root is : " + x);
    }
}

package Learning.Help;

import java.util.Scanner;

public class Exercise2{

    public static double equation(double x)
    {
        // f(x) = Cos(x+Sin(x)) = 0

        double valueEq1 = Math.cos(x+Math.sin(x));
        return valueEq1;


    }

    public static double derviate_of_equation(double x){

        //f'(x) = −(cos(x)+1)*sin(sin(x)+x)

        double value_der_eq1 = - (Math.cos(x)+1)*Math.sin(Math.sin(x)+x);

        return value_der_eq1;

    }

    //finding initial value of x0
    public static double findInitialPoint() {

        Scanner sc= new Scanner(System.in);
        //Finding points a and b such that a<b and f(a) * f(b)<0.

        while(true){


            System.out.println("Note: Enter points a and b such that a<b and f(a) * f(b)<0 ");

            System.out.print("Enter point a- ");

            double a= sc.nextDouble();

            System.out.print("Enter point b- ");

            double b= sc.nextDouble();

            if(a<b && (equation(a)*equation(b)<0)){
                System.out.println("Root lies between a and b ");
                return ((a+b)/2);

            }
            else{
                System.out.println("Error");
            }

        }

    }

    public static double newton_rapson_function(double x){
        //Epsilon assumed assumed.
        double EPSILON = 0.001;

        double h = equation(x) / derviate_of_equation(x);
        while (Math.abs(h) >= EPSILON)
        {
            h = equation(x) / derviate_of_equation(x);

            // x(i+1) = x(i) - f(x) / f'(x)
            x = x - h;
        }

        return x;
    }

    public static void main(String args[]){

        System.out.println("Our Equation is f(x) = Cos(x+Sin(x)) = 0");


        System.out.println("Derivate of Our Equation is : f'(x) = -(cos(x)+1)*sin(sin(x)+x)");


        double x = newton_rapson_function(findInitialPoint());

        System.out.println("The value of the root is : " + x);



    }
}

package Learning;

public class NRM {

    static final double EPSILON = 0.001;

    // An example function whose solution. is determined using Bisection Method.
    // The function is x^7 - 5 * x^4 + 2 * x - 17
    static double function(double x)
    {
        return Math.pow(x,7) - (5 * Math.pow(x,4)) + (2 * x) - 17;
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

        System.out.print("The value of the"
                + " root is : "
                + Math.round(x * 100.0) / 100.0);
    }

    // Driver code
    public static void main (String[] args)
    {

        // Initial values assumed
        double x0 = 0.5;
        newtonRaphson(x0);
    }
}

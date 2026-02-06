import java.util.Scanner; 

public class PowerCalculation { // declare a public class named PowerCalculation

    public static double power(double x, int n) { // function to calculate x^n, returns double
        double result = 1; // initialize result to 1 (starting value for multiplication)
        for (int i = 1; i <= n; i++) { // loop n times
            result *= x; // multiply result by x in each iteration
        }
        return result; // return the final result
    }

    public static void main(String[] args) { // main method, program execution starts here
        Scanner sc = new Scanner(System.in); // create Scanner object to read input

        System.out.print("Enter the base number (x): "); // ask user for base number
        double x = sc.nextDouble(); // read base number as double

        System.out.print("Enter the exponent (n): "); // ask user for exponent
        int n = sc.nextInt(); // read exponent as integer

        double result = power(x, n); // call power function and store result

        System.out.println(x + " raised to the power of " + n + " is: " + result); 
        // print the result

        sc.close(); // close the Scanner object
    }
}


/**
 * Course: CEN 4802
 * Student: MInh Ngoc Tran
 *
 * Assignment 1
 * This Java class implements a recursive method to compute the nth term
 * of the Fibonacci sequence. The program includes proper Javadoc
 * documentation describing the method’s purpose, parameters, and return value.
 * A main method is provided to demonstrate the functionality by calculating
 * and displaying the 10th Fibonacci number. The implementation follows Java
 * best practices and meets the assignment requirements for recursion and documentation.
 */

public class Fibonacci {

    /**
     * Returns the nth term in the Fibonacci sequence using a recursive approach.
     *
     * @param n the position in the Fibonacci sequence (n must be greater than or equal to 0)
     * @return the value of the nth Fibonacci number
     */

    public static int fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        int result = fib(n);
        System.out.println(
                "The " + n + "th term of the Fibonacci sequence is " + result + "."
        );
    }
}

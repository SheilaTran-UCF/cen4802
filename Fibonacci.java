public class Fibonacci {

    /**
     * Returns the nth term in the Fibonacci sequence using recursion.
     *
     * @param n the index of the term (must be >= 0)
     * @return the nth Fibonacci number
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

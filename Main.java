public class Main {

    /**
     * Calculates the nth term in the Fibonacci sequence.
     *
     * This method uses a recursive approach to compute the Fibonacci number
     * at the specified position in the sequence.
     *
     * @param n the term of the Fibonacci sequence to calculate (must be non-negative)
     * @return the nth term in the Fibonacci sequence
     * @throws IllegalArgumentException if n is negative
     */
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // The term we want to find
        int result = fibonacci(n); // Call the recursive method
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}
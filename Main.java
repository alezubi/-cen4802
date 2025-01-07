public class Main {

    // Recursive method to calculate the nth term in the Fibonacci sequence
    public static int fibonacci(int n) {
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
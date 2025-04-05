public class FibonacciRecursive {

    public static int fib (int number) {
        if (number <= 1) {
            return number;
        }
        return fib(number - 1) + fib(number - 2);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(fib(n));
    }
}

// T: Exponential time compelxity (O(2^n))
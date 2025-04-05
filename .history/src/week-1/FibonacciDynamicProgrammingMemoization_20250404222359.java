
package week-1;
import java.util.HashMap;
import java.util.Map;

public class FibonacciDynamicProgrammingMemoization {

    private static Map<Integer, Integer> memo = new HashMap<>(); // storing number and it's fib value

    public static int fib(int number) {
        if (number <= 1) {
            return number;
        }
        if (!memo.containsKey(number)) {
            memo.put(number, fib(number - 1) + fib(number - 2));
        }
        return memo.get(number); 
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(fib(n));
    }

    
}
import java.util.HashMap;
import java.util.Map;

public class FibonacciDynamicProgrammingMemoization {

    private static Map<Integer, Integer> memo = new HashMap<>();

    public static int fib(int number) {
        if (number <= 1) {
            return number;
        }
        if (memo.containsKey(number)) {
            
        }


        return number;
    }

    
}
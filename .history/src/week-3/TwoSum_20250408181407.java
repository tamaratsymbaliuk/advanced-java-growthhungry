import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> complements = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
         int currVal  = nums[i];
         int complement = target - currVal;
             if (complements.containsKey(complement)) {
                return new int[] {complements.get(complement), i};
            }
            
        }
        return new int[]{};
    }

    public static void main(String[] args) {

        int[] nums = {5, 8, 3, 9};
        int[] indices = twoSum(nums, 13);
        System.out.println(indices[0] + " " + indices[1]);
    }
    
}

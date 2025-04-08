import javax.sound.sampled.SourceDataLine;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int num1 = 0;
        int num2 = target - num1;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.comtainsKey(nums[i]) ) {

            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {5, 8, 3, 9};
        int[] indices = twoSum(nums, 13);
        System.out.println(indices[0] + " " + indices[1]);
    }
    
}

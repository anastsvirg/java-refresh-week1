import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumTask {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int neededNum = target - nums[i];
            if (seen.containsKey(neededNum)) {
                return (new int[] { seen.get(neededNum), i });
            } else {
                seen.put(nums[i], i);
            }
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[] { 2, 7, 11, 15 }, 9)));
        System.out.println(Arrays.toString(twoSum(new int[] { 3, 2, 4 }, 6)));
        System.out.println(Arrays.toString(twoSum(new int[] { 3, 3 }, 6)));
    }

}

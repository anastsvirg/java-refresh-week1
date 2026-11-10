import java.util.Arrays;
import java.util.TreeSet;

public class MaximumTask {

    public static int findMax(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("An array is empty!");
        }

        int maxNum = numbers[0];

        /*
         * if (numbers.length == 0) {
         * System.out.
         * println("The array is empty. The default maximum was passed as a result.");
         * return maxNum;
         * }
         * 
         * // looked up which data set i needed to use and how they work
         * 
         * // I used TreeSet because it's a collection with no duplicates in sorted
         * order,
         * // which helps to store the values. The complexity should be O(n) cuz we only
         * // change the size of an array
         * 
         * // I don't know what's auxiliary space complexity is
         * TreeSet<Integer> nums = new TreeSet<>();
         * 
         * for (int num : numbers) {
         * nums.add(num);
         * }
         * 
         * // looked up how to find last value
         * maxNum = nums.last();
         */

        for (int num : numbers) {
            if (num > maxNum) {
                maxNum = num;
            }
        }

        return maxNum;
    }

    public static void showResult(int[] numbers) {
        System.out.println("The maximum number in this array " + Arrays.toString(numbers) + " is " + findMax(numbers));
    }

    public static void main(String[] args) {

        showResult(new int[] { 2, 7, 3, 1 });
        showResult(new int[] { -8, -2, -15, -4 });
        showResult(new int[] { 5 });
        showResult(new int[] { 0, 0, 0 });
        showResult(new int[] { -10, 0, 10 });

    }
}

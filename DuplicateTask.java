import java.util.Arrays;
import java.util.HashSet;

public class DuplicateTask {

    public static boolean containsDuplicate(int[] numbers) {

        HashSet<Integer> nums = new HashSet<Integer>();

        boolean wasAdded;

        for (int num : numbers) {
            wasAdded = nums.add(num);
            if(wasAdded){
                return true;
            }
        }

        return false;

    }

    public static void showResult(int[] numbers) {
        System.out
                .println("Are there any duplicates in " + Arrays.toString(numbers) + ": " + containsDuplicate(numbers));
    }

    public static void main(String[] args) {

        showResult(new int[] { 1, 2, 3, 1 });
        showResult(new int[] { 1, 2, 3, 4 });
        showResult(new int[] { 1, 1, 1, 3, 3, 4 });
        showResult(new int[] {});
        showResult(new int[] { -1, -2, -3, -1 });

    }

}

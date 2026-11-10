import java.util.Arrays;
import java.util.TreeSet;

public class MaximumTask {

    public static int findMax(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("An array is empty!");
        }

        int maxNum = numbers[0];

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

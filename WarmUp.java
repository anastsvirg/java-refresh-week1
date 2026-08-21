import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class WarmUp {

    static int findMax(int[] numbers) {

        int maxNum = numbers[0];

        for (int num : numbers) {
            if (num > maxNum) {
                maxNum = num;
            }
        }

        return maxNum;
    }

    static int countOccurrences(int[] numbers, int target) {

        int count = 0;

        for (int num : numbers) {
            if (target == num) {
                count++;
            }
        }

        return count;

    }

    static String removeDuplicates(String text) {

        HashSet<String> letters = new HashSet<String>();
        String newText = "";

        String[] splitText = text.trim().split("\\s+");

        for (String word : splitText) {

            if (!letters.contains(word)) {
                letters.add(word);
                newText += " " + word;
            }

        }

        return newText.trim();

    }

    static <T> void printItems(List<T> items) {
        System.out.println(items);
    }

    public static void main(String[] args) {

        int[] testArray = { 2, 3, 2, 5, 7, 2 };
        String testString = "Test is is testing this this text";

        System.out.println("Find max of [2,3,2,5,7,2]\nMax is " + findMax(testArray));

        System.out.println("Occurrences of 2 in [2,3,2,5,7,2]: " + countOccurrences(testArray, 2));

        System.out.println(testString);
        System.out.println(removeDuplicates(testString));

        List<String> testStringGenerics = new ArrayList<String>();
        List<Integer> testIntegerGenerics = new ArrayList<Integer>();

        testStringGenerics.add("Bloo");
        testStringGenerics.add("Blee");
        testStringGenerics.add("Blaa");

        testIntegerGenerics.add(5);
        testIntegerGenerics.add(7);
        testIntegerGenerics.add(11);

        printItems(testStringGenerics);
        printItems(testIntegerGenerics);

    }

}

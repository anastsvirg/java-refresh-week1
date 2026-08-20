import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DataStructure {

    static boolean containsDuplicate(int[] numbers) {

        HashSet<Integer> unicNums = new HashSet<Integer>();

        for (int num : numbers) {
            if (unicNums.contains(num)) {
                return true;
            } else {
                unicNums.add(num);
            }
        }

        return false;
    }

    static Map<Character, Integer> characterFrequency(String text) {

        Map<Character, Integer> letterCount = new HashMap<Character, Integer>();

        for (int i = 0; i < text.length(); i++) {
            if (letterCount.get(text.charAt(i)) == null) {
                letterCount.put(text.charAt(i), 1);
            } else {
                int count = letterCount.get(text.charAt(i)) + 1;
                letterCount.put(text.charAt(i), count);
            }
        }

        return letterCount;

    }

    static ArrayList<Integer> findEvenNumbers(int[] numbers) {

        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }

        return evenNumbers;

    }

    public static void main(String[] args) {

        int[] numberTrue = { 1, 2, 3, 1 };
        int[] numberFalse = { 1, 2, 3, 4 };

        System.out.println("[1,2,3,1] -> " + containsDuplicate(numberTrue));
        System.out.println("[1,2,3,4] -> " + containsDuplicate(numberFalse));

        Map<Character, Integer> letterCount = new HashMap<Character, Integer>();

        letterCount = characterFrequency("banana");

        for (char i : letterCount.keySet()) {
            System.out.println(i + " -> " + letterCount.get(i));
        }

        int[] numbers = { 1, 2, 3, 4, 5, 6 };
        System.out.println("[1,2,3,4,5,6]");
        System.out.println(findEvenNumbers(numbers));

    }

}

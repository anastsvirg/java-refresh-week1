import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountWordTask {

    public static Map<String, Integer> countWords(String[] words) {

        HashMap<String, Integer> wordCount = new HashMap<String, Integer>();

        for (String word : words) {
            // looked up how to do that in one line without additional loops and checks
            wordCount.compute(word, (key, val) -> val == null ? 1 : val + 1);
        }

        return wordCount;
    }

    public static void printResult(String[] words) {
        System.out.println("Word frequency in " + Arrays.toString(words) + "  array is  ");
        countWords(words).forEach((key, value) -> System.out.println(key + " " + value));
    }

    public static void main(String[] args) {
        printResult(new String[] { "java", "python", "java" });
        printResult(new String[] { "apple", "apple", "apple" });
        printResult(new String[] { "a", "b", "c" });
        printResult(new String[] {});
        printResult(new String[] { "Java", "java" });
    }

    // HashSet is not an applicable data set for this task because it woulg store
    // only a word value without any duplicates. On our case we needed to count the
    // frequency and have the unique value of each word. We used words as keyes and
    // count was a value that was only reliable for a specific key.

    // The time complexity will be O(n) because it will relay on the initial value
    // of string array without any additional variables or loops. Same goes for
    // auxiliary space complexity
}

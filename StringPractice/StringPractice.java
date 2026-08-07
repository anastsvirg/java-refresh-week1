package StringPractice;

import java.util.HashMap;

public class StringPractice {

    static String reverse(String text) {

        String reverseText = "";

        for (int i = 0; i < text.length(); i++) {
            reverseText = text.charAt(i) + reverseText;
        }

        return reverseText;
    }

    static boolean isPalindrome(String text) {

        boolean isPalindrome = false;
        String reverseText;

        text = text.toLowerCase();
        text = text.replace(" ", "");
        reverseText = reverse(text);

        isPalindrome = (text.equals(reverseText)) ? true : false;

        return isPalindrome;
    }

    static int countWords(String text) {

        int wordsAmount = 0;

        if (text.length() == 0) {
            return wordsAmount;
        }

        if (text.indexOf(" ") == 0) {
            if (text.length() == 1) {
                return wordsAmount;
            }

            text = text.replaceFirst(" ", "");

        }

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordsAmount++;
            }
        }

        if (text.indexOf(" ") == text.length() - 1) {
            return wordsAmount;
        } else {
            wordsAmount++;
        }

        if (wordsAmount == 0 && text.length() > 0) {
            wordsAmount++;
        }

        return wordsAmount;
    }

    static char firstNonRepeatedCharacter(String text) {

        char firstNonRepeatedCharacter = ' ';
        HashMap<Character, Integer> eachCharAmount = new HashMap<Character, Integer>();

        for (int i = 0; i < text.length(); i++) {
            if (eachCharAmount.containsKey(text.charAt(i))) {
                int amount = eachCharAmount.get(text.charAt(i)) + 1;
                eachCharAmount.put(text.charAt(i), amount);
            } else {
                eachCharAmount.put(text.charAt(i), 1);
            }
        }

        for (int i = 0; i < text.length(); i++) {
            if (eachCharAmount.get(text.charAt(i)) == 1) {
                firstNonRepeatedCharacter = text.charAt(i);
                break;
            } else
                continue;
        }

        return firstNonRepeatedCharacter;
    }

    public static void main(String[] args) {
        String text = " oi Never a odd or even";

        System.out.println(reverse(text));

        if (isPalindrome(text)) {
            System.out.println("Is a palindrome");
        } else {
            System.out.println("Is not a palindrome");
        }

        System.out.printf("Amount of words: %s", countWords(text));

        System.out.println("\nFirst nonrepeated charecter is " + firstNonRepeatedCharacter(text));
    }

}

public class VowelsTask {

    public static int countVowels(String text) {

        int amount = 0;
        text = text.toLowerCase();

        // checked how to find out the string is empty
        if (text.isEmpty()) {
            return amount;
        }

        // checked how to do for-each
        // found out it's not used for string
        // did't write for loop correctly at first

        // I choosed for loop so I can go through the whole string without doing inner
        // loops and doing it only once. I used if for the only check without
        // overloading the code with additional checkings. Before counting i am checking
        // exceptions, which in this case is an empty string and stop the method if that
        // is true. In my opinion the coplexity is O(1) because we are going through the
        // string only once
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o'
                    || text.charAt(i) == 'u') {
                amount++;
            }
        }

        return amount;
    }

    public static void printResult(String text) {
        // forgot how to print results

        int amount = countVowels(text);

        System.out.println("The amount of vowels in \"" + text + "\" is " + amount);
    }

    public static void main(String[] args) {

        printResult("Hello World");
        printResult("JAVA");
        printResult("Programming");
        printResult("rhythm");
        printResult("");
        printResult("AEIOUaeiou");

    }

}

public class VowelsTask {

    public static int countVowels(String text) {

        int amount = 0;
        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o'
                    || text.charAt(i) == 'u') {
                amount++;
            }
        }

        return amount;
    }

    public static void printResult(String text) {

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

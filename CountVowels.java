import java.util.Scanner;

public class CountVowels {

    static int countVowels(String text) {

        int vowelsAmount = 0;
        text = text.toLowerCase();

        if (text.length() == 0) {
            return vowelsAmount;
        }

        for (int i = 0; i < text.length(); i++) {

            // a,e,i,o,u
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o'
                    || text.charAt(i) == 'u') {
                vowelsAmount++;
            }

        }

        return vowelsAmount;
    }

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        boolean isRunning = false;

        do {
            System.out.println("Enter text: ");

            int vowelsAmount = countVowels(myObj.nextLine());

            System.out.printf("The amount of vowels is %d", vowelsAmount);

            System.out.println("\nDo you want to continue?\n1 - Yes, Anything else - No");

            isRunning = (myObj.nextInt() == 1) ? true : false;
            myObj.nextLine();

        } while (isRunning);

    }

}

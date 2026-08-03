import java.util.Scanner;

public class StartProject {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        boolean anotherStudent = false;
        String userName;

        do {
            System.out.print("Enter students name: ");
            userName = myObj.nextLine();
            int markAvg = 0;

            System.out.println(userName + ", please enter 5 marks");

            for (int i = 0; i < 5; i++) {
                int mark;
                do {
                    mark = myObj.nextInt();
                } while (!(mark <= 100 && mark >= 0));
                markAvg += mark;
            }

            markAvg /= 5;

            System.out.print("Your grade is ");

            if (markAvg >= 90) {
                System.out.println("A");
            } else if (markAvg >= 80 && markAvg <= 89) {
                System.out.println("B");
            } else if (markAvg >= 70 && markAvg <= 79) {
                System.out.println("C");
            } else if (markAvg >= 60 && markAvg <= 69) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            System.out.println(
                    "Do you want to calculate an avarage grade for a different student? Enter 1 if yes and anything else for no");

            int answear = myObj.nextInt();
            myObj.nextLine();
            anotherStudent = (answear == 1) ? true : false;

        } while (anotherStudent);
    }
}

package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

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

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

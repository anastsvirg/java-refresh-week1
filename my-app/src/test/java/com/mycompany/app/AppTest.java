package com.mycompany.app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        Assertions.assertTrue(true);
    }

    @Test
    void findMaxReturnsLargestNumber() {
        int[] numbers = { 2, 7, 3, 1 };

        int result = App.findMax(numbers);

        Assertions.assertEquals(7, result);
    }

    @Test
    void findMaxWorksWithNegativeNumbers() {
        int[] numbers = { -8, -2, -15, -4 };

        int result = App.findMax(numbers);

        Assertions.assertEquals(-2, result);
    }

    @Test
    void findMaxWorksWithOneNumber() {
        int[] numbers = { 5 };

        int result = App.findMax(numbers);

        Assertions.assertEquals(5, result);
    }

    @Test
    void findMaxWorksWithOneNumberFalse() {
        int[] numbers = { 5 };

        int result = App.findMax(numbers);

        Assertions.assertEquals(9999, result);
    }

    @Test
    void countOccurrencesReturnsCorrectCount() {
        int[] numbers = { 1, 2, 2, 4, 2 };

        int result = App.countOccurrences(numbers, 2);

        Assertions.assertEquals(3, result);
    }

    @Test
    void countOccurrencesReturnsZeroWhenMissing() {
        int[] numbers = { 1, 2, 3 };

        int result = App.countOccurrences(numbers, 10);

        Assertions.assertEquals(0, result);
    }
}
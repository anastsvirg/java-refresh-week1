package com.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PaymentProcessorTest {

    public class FakePaymentMethod implements PaymentMethod {

        public boolean wasCalled = false;
        public double receivedAmount;

        @Override
        public void pay(double amount) {
            wasCalled = true;
            receivedAmount = amount;
        }
    }

    @Test
    void cardPaymentShouldRejectNegativeAmount() {
        PaymentProcessor processor = new PaymentProcessor(new CardPayment());

        assertThrows(
                IllegalArgumentException.class,
                () -> processor.processPayment(-50));
    }

    @Test
    void cashPaymentShouldRejectZero() {
        PaymentProcessor processor = new PaymentProcessor(new CashPayment());

        assertThrows(
                IllegalArgumentException.class,
                () -> processor.processPayment(0));
    }

    @Test
    void cardPaymentShouldRejectDoubleNaN() {
        PaymentProcessor processor = new PaymentProcessor(new CardPayment());

        assertThrows(
                IllegalArgumentException.class,
                () -> processor.processPayment(Double.NaN));
    }

    @Test
    void cashPaymentShouldRejectDoublePositiveInfinity() {
        PaymentProcessor processor = new PaymentProcessor(new CashPayment());

        assertThrows(
                IllegalArgumentException.class,
                () -> processor.processPayment(Double.POSITIVE_INFINITY));
    }

    @Test
    void processorShouldDelegateToInjectedPaymentMethod() {
        FakePaymentMethod fakePaymentMethod = new FakePaymentMethod();

        PaymentProcessor processor = new PaymentProcessor(fakePaymentMethod);

        processor.processPayment(125.50);

        assertTrue(fakePaymentMethod.wasCalled);
        assertEquals(125.50, fakePaymentMethod.receivedAmount);
    }
}

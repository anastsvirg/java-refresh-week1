package com.practice;

public class App {
    public static void main(String[] args) {
        PaymentProcessor cardPayment = new PaymentProcessor(new CardPayment());
        PaymentProcessor cashPayment = new PaymentProcessor(new CashPayment());

        cardPayment.processPayment(100);
        cashPayment.processPayment(20);
    }
}

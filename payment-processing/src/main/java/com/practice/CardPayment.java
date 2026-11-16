package com.practice;

public class CardPayment extends AbstractPayment {

    @Override
    public void pay(double amount) {
        validateAmount(amount);

        System.out.printf("Paid £%.1f using card%n", amount);
    }
}

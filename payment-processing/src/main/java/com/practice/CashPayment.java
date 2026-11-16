package com.practice;

public class CashPayment extends AbstractPayment {

    @Override
    public void pay(double amount) {
        validateAmount(amount);

        System.out.printf("Paid £%.1f using cash%n", amount);
    }
}

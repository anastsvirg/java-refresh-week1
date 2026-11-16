package com.practice;

public abstract class AbstractPayment
        implements PaymentMethod {

    protected void validateAmount(double amount) {
        if (amount <= 0 || !Double.isFinite(amount)) {
            throw new IllegalArgumentException(
                    "Invalid amount!");
        }
    }
}

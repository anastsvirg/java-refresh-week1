package com.practice.spring_payment_demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class CardPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Paid £" + amount + " by card");
    }
}
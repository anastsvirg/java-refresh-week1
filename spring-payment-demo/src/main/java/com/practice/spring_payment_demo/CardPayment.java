package com.practice.spring_payment_demo;

import org.springframework.stereotype.Component;

@Component
public class CardPayment {

    public void pay(double amount) {
        System.out.println("Paid £" + amount + " by card");
    }
}
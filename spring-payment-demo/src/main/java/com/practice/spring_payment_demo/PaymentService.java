package com.practice.spring_payment_demo;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final CardPayment cardPayment;

    public PaymentService(CardPayment cardPayment) {
        this.cardPayment = cardPayment;
    }

    public void processPayment(double amount) {
        cardPayment.pay(amount);
    }

}

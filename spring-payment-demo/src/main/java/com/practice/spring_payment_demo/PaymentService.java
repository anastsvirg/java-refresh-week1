package com.practice.spring_payment_demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentMethod paymentMethod;

    public PaymentService(@Qualifier("cashPayment") PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(double amount) {
        paymentMethod.pay(amount);
    }

}

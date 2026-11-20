package com.practice.spring_payment_demo;

public class PaymentResponse {

    private final String status;
    private final Double amount;
    private final String message;

    public PaymentResponse(String status, Double amount, String message) {
        this.status = status;
        this.amount = amount;
        this.message = message;
    }

    public String getStatus() {
        return this.status;
    }

    public Double getAmount() {
        return this.amount;
    }

    public String getMessage() {
        return this.message;
    }

}

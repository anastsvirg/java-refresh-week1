package com.practice.spring_payment_demo;

public class ErrorResponse {
    private final String status;
    private final String message;

    public ErrorResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return this.status;
    }

    public String getMessage() {
        return this.message;
    }
}

package com.practice.spring_payment_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;

@RestController
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/payment/status")
    public String getPaymentStatus() {
        return paymentService.getStatus();
    }

    @PostMapping("/payment/process")
    public ResponseEntity<PaymentResponse> setPaymentStatus(@Valid @RequestBody PaymentRequest paymentRequest) {
        Double amount = paymentRequest.getAmount();
        if (!Double.isFinite(amount)) {
            return ResponseEntity.badRequest().build();
        }
        paymentService.processPayment(amount);
        PaymentResponse response = new PaymentResponse(
                "SUCCESS",
                amount,
                "Payment request processed");
        return ResponseEntity.ok(response);
    }

}

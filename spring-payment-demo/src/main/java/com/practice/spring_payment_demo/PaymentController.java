package com.practice.spring_payment_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
    public ResponseEntity<String> setPaymentStatus(@RequestBody PaymentRequest paymentRequest) {
        double amount = paymentRequest.getAmount();
        if (amount <= 0 || !Double.isFinite(amount)) {
            return ResponseEntity.badRequest().body("Invalid input");
        }
        paymentService.processPayment(amount);
        return ResponseEntity.ok("Request accepted");
    }

}

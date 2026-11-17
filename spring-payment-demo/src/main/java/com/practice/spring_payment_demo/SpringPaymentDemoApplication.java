package com.practice.spring_payment_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringPaymentDemoApplication {

	@Bean
	CommandLineRunner run(PaymentService paymentService) {
		return args -> paymentService.processPayment(100);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringPaymentDemoApplication.class, args);
	}

}

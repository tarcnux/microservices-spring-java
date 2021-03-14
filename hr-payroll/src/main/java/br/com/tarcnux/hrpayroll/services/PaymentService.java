package br.com.tarcnux.hrpayroll.services;

import org.springframework.stereotype.Service;

import br.com.tarcnux.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	public Payment getPayment(long workerID, int days) {
		return new Payment("Bob", 200.0, days);
	}
}

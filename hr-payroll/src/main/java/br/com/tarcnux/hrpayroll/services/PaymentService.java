package br.com.tarcnux.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tarcnux.hrpayroll.entities.Payment;
import br.com.tarcnux.hrpayroll.entities.Worker;
import br.com.tarcnux.hrpayroll.feignClients.WorkerFeignClient;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerID, int days) {
		
		
		
		Worker worker = workerFeignClient.findById(workerID).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}

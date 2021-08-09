package com.ms.api.rewards.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ms.api.rewards.entity.Customer;
import com.ms.api.rewards.service.RewardService;



@RestController
public class RewardController {
	
	@Autowired
	private RewardService rewardService;
	
	@GetMapping("/customers")
	public List<Customer> findAllCustomers() {
		return rewardService.getAllCustomers();
	}
	
	@GetMapping("/customers/{id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable long id) {
		
		Customer customer = rewardService.getCustomerById(id);
		if(customer ==  null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(customer, HttpStatus.OK);
	}
}

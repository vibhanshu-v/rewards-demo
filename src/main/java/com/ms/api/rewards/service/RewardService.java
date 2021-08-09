package com.ms.api.rewards.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.api.rewards.entity.Customer;
import com.ms.api.rewards.repository.CustomerRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RewardService {

	@Autowired
	private CustomerRepository repository;

	public Customer getCustomerById(final long customerId) {
		log.debug("CustomerRepository getCustomerById executed");
		return repository.findById(customerId).orElse(null);
	}
	
	public List<Customer> getAllCustomers(){
		log.debug("CustomerRepository getAll customers executed");
		return repository.findAll();
	}
}

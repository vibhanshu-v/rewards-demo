package com.ms.api.rewards.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.api.rewards.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long>{ 

}

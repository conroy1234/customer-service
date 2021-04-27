package com.customer.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.customer.service.bean.Customer;
import com.customer.service.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping(path="customer/id/{id}")
	public Customer findByFirstAndLastName(@PathVariable long id) {
		Customer customer= customerService.findById(id);
		System.out.println("**********************************"+customer);
		return new Customer(customer.getFirstName(),customer.getLastName(),customer.getAddress(),customer.getPostCode());
		
		
	}

}

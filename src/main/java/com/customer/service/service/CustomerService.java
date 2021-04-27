package com.customer.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.service.bean.Customer;
import com.customer.service.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository cuisteomrRepo;
	
	public Customer findById(long id) {
		return cuisteomrRepo.findById(id).get();
		
	}

}

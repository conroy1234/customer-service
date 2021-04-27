package com.customer.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.customer.service.bean.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
	

}

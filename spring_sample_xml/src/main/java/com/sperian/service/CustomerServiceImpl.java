package com.sperian.service;

import java.util.List;

import com.sperian.model.Customer;
import com.sperian.repository.CustomerRepository;
import com.sperian.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	
	public List<Customer> findAll(){
		return customerRepository.findAll();	
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
}

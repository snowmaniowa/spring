package com.sperian.xml.service;

import java.util.List;

import com.sperian.xml.model.Customer;
import com.sperian.xml.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl(){		
	}
	
	public CustomerServiceImpl(CustomerRepository repository){
		this.customerRepository = repository;
	}
	
	public List<Customer> findAll(){
		return customerRepository.findAll();	
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
}

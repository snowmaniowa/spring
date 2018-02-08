package com.sperian.service;

import java.util.List;

import com.sperian.model.Customer;
import com.sperian.repository.CustomerRepository;
import com.sperian.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	public List<Customer> findAll(){
		return customerRepository.findAll();	
	}
	
}

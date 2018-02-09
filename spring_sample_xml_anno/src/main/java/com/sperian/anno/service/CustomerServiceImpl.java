package com.sperian.anno.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sperian.anno.model.Customer;
import com.sperian.anno.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	//Spring uses COMPONENT SCANNER and annotates at the member variable level
	// @Autowired
	private CustomerRepository customerRepository;

	//Spring uses COMPONENT SCANNER and annotates during the constructor injection
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository){
		this.customerRepository = customerRepository;
	}
	
	//Spring uses COMPONENT SCANNER and annotates during the setter injection
	//@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}

package com.sperian.repository;

import java.util.ArrayList;
import java.util.List;

import com.sperian.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	public List<Customer> findAll(){
		
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		customer.setFirstName("Lebron @ Java Application Config");
		customer.setLastName("James @ Java Application Config");
		customers.add(customer);
		
		return customers;
	}
	
}

package com.sperian.repository;

import java.util.ArrayList;
import java.util.List;

import com.sperian.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	public List<Customer> findAll(){
		
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		customer.setFirstName("Lebron - appContext");
		customer.setLastName("James - appContext");
		customers.add(customer);
		
		return customers;
	}
	
}

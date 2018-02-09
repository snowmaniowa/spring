package com.sperian.xml.repository;

import java.util.ArrayList;
import java.util.List;

import com.sperian.xml.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	public List<Customer> findAll(){
		
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		customer.setFirstName("Lebron");
		customer.setLastName("James");
		customers.add(customer);

		Customer customer2 = new Customer();
		customer2.setFirstName("Stephen");
		customer2.setLastName("Curry");
		customers.add(customer2);
		customers.add(customer2);
		customers.add(customer2);
		
		return customers;
	}
	
}

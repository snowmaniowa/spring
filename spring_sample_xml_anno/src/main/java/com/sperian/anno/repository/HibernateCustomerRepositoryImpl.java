package com.sperian.anno.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sperian.anno.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	public List<Customer> findAll(){
		
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		customer.setFirstName("Roger - Annotation-config");
		customer.setLastName("Federer - Annotation-config");
		customers.add(customer);
		
		return customers;
	}
	
}

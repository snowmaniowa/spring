package com.sperian.xml.repository;

import java.util.List;

import com.sperian.xml.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}
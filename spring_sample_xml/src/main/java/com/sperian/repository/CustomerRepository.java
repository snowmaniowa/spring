package com.sperian.repository;

import java.util.List;

import com.sperian.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}
package com.sperian.anno.repository;

import java.util.List;

import com.sperian.anno.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}
package com.sperian;

import com.sperian.service.CustomerService;
import com.sperian.service.CustomerServiceImpl;

public class ApplicationAnno {

	public static void main(String[] args) {

		CustomerService customerService = new CustomerServiceImpl();
		
		System.out.println(customerService.findAll().get(0).getFirstName());
	}

}

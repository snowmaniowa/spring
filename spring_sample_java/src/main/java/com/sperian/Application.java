package com.sperian;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sperian.service.CustomerService;
import com.sperian.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {

		ApplicationContext javaAppContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CustomerService customerService = javaAppContext.getBean("customerService", CustomerService.class);
		
		System.out.println(customerService.findAll().get(0).getFirstName());
		System.out.println(customerService.findAll().get(0).getLastName());
	}

}

package com.sperian.xml;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sperian.xml.model.Customer;
import com.sperian.xml.service.CustomerService;

public class ApplicationWithXMLConfig {

	public static void main(String[] args) {

		//How to get reference to Spring application context?
		String configLocation = "santhaApplicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
		
		//How to access a spring bean? 
		CustomerService service = applicationContext.getBean("customerServiceBean", CustomerService.class);
		
		//Invoke and test
		List<Customer> customers = service.findAll();
		System.out.println("Total customers: " + customers.size());
		
	}

}

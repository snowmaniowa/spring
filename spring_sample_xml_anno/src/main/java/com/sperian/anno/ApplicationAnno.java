package com.sperian.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sperian.anno.service.CustomerService;
import com.sperian.anno.service.CustomerServiceImpl;

public class ApplicationAnno {

	public static void main(String[] args) {

		String configLocation = "santhaApplicationContextXMLAnno.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		
		CustomerService service = context.getBean("customerService", CustomerService.class);		
		System.out.println(service.findAll().get(0).getFirstName());
		System.out.println(service.findAll().get(0).getLastName());
	}

}

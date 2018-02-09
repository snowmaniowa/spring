package com.sperian;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sperian.repository.CustomerRepository;
import com.sperian.repository.HibernateCustomerRepositoryImpl;
import com.sperian.service.CustomerService;
import com.sperian.service.CustomerServiceImpl;

@Configuration
public class AppConfig {
	
	@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository(){
		return new HibernateCustomerRepositoryImpl();
	}

//	@Bean(name= "customerService")
//	public CustomerService getCustomerService(){		
//		CustomerServiceImpl customerService = new CustomerServiceImpl();		
//		customerService.setCustomerRepository(getCustomerRepository());	//Setter injection		
//		return customerService;
//	}

	@Bean(name= "customerService")
	public CustomerService getCustomerService(){		
		return new CustomerServiceImpl(getCustomerRepository()); //Constructor injection
	}
	
	
}

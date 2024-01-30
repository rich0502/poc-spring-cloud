package com.bk.customerservice;

import com.bk.customerservice.entities.Customer;
import com.bk.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@EnableConfigurationProperties(GlobalConfig.class)
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
		return args -> {
			for (int i = 0; i < 10; i++) {
				Customer customer  = Customer.builder()
						.firstName("Ulrich" + i)
						.lastName("ANDRIANARIVONY" + i)
						.email("ulrichandri@gmail"+i+".com")
						.build();
				customerRepository.save(customer);
			}
		};
	}
}

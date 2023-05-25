package sam.microservices.rest.springcloud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sam.microservices.rest.springcloud.entities.Customer;
import sam.microservices.rest.springcloud.reposirory.CustomerRepository;

@SpringBootApplication
public class CustomersMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomersMicroserviceApplication.class, args);
	}

	@Bean
	CommandLineRunner startCommand(CustomerRepository customerRepository) {
		return args -> {
			customerRepository.save(new Customer(null, "cust1", "cust1@mail.com"));
			customerRepository.save(new Customer(null, "cust2", "cust2@mail.com"));
			customerRepository.save(new Customer(null, "cust3", "cust3@mail.com"));
			customerRepository.save(new Customer(null, "cust4", "cust4@mail.com"));

			customerRepository.findAll().forEach(System.out::println);
		};

	}
}



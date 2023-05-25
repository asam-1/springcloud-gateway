package sam.microservices.rest.springcloud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sam.microservices.rest.springcloud.entities.Product;
import sam.microservices.rest.springcloud.repository.ProductRepository;

@SpringBootApplication
public class ProductsMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsMicroserviceApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ProductRepository productRepository) {
		return args -> {
			productRepository.deleteAll();
			productRepository.save(new Product(null, "prod1", 23, 99.76));
			productRepository.save(new Product(null, "prod2", 654, 34.66));
			productRepository.save(new Product(null, "prod3", 67, 77.55));
			productRepository.save(new Product(null, "prod4", 152, 33.89));

			productRepository.findAll().forEach(System.out::println);
		};
	}

}

package sam.microservices.rest.springcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import sam.microservices.rest.springcloud.entities.Product;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {
}

package sam.microservices.rest.springcloud.reposirory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sam.microservices.rest.springcloud.entities.Customer;
@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

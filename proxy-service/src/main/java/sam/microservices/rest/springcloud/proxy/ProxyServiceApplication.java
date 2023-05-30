package sam.microservices.rest.springcloud.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProxyServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProxyServiceApplication.class, args);
    }

 /*   @Bean
    RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/products/**")
                        .filters(f -> f.addRequestHeader("custom-product-request-header", "custom-product-request-header")
                                .addResponseHeader("custom-product-response-header", "custom-product-response-header"))
                        .uri("http://localhost:8082/"))
                .route(r -> r.path("/customers/**")
                        .filters(f -> f.addRequestHeader("custom-customer-request-header", "custom-customer-request-header")
                                .addResponseHeader("custom-customer-response-header", "custom-customer-response-header"))
                        .uri("http://localhost:8081/"))
                .build();
    }*/

}

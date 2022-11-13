package lesson2;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@RequiredArgsConstructor
@Component
public class Cart {

    Cart cart = new Cart();
    ProductRepository productRepository = new ProductRepository();
    @Bean
    public Product addById(int id) {
        productRepository.repositoryProduct().add(id, new Product());
        return new Product();
    }
    @Bean
    public String removeById(int id) {
        productRepository.repositoryProduct().remove(id);
        return ("Product " + id + "removed");
    }
}

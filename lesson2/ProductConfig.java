package lesson2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ProductConfig {

    @Bean
    public List createProduct() {
        ProductRepository productRepository = new ProductRepository();
        return productRepository.createProduct();
    }
    @Bean
    public List addProd(){
        Cart cart = new Cart();
        return cart.addProd();
    }

    @Bean
    public List delProd(){
        Cart cart = new Cart();
        return cart.delProd();
    }
}

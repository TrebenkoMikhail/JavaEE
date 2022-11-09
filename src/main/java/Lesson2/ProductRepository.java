package Lesson2;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component("products")
public class ProductRepository {

@Bean
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "Apple", 10));
        products.add(new Product(2, "Pineapple", 12));
        products.add(new Product(3, "Cherry", 14));
        products.add(new Product(4, "Watermelon", 25));
        products.add(new Product(5, "Lemon", 3));

    }


    public void getProducts(){
        System.out.println(ProductRepository.class);
    }

 }

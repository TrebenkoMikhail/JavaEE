package lesson2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("lesson2");

        ProductRepository productRepository = context.getBean(ProductRepository.class);

        Cart cart =context.getBean(Cart.class);


        System.out.println(productRepository.repositoryProduct());




//        context.close();

    }
}
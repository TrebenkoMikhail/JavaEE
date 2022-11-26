package lesson2;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext("lesson2");

        List createProduct = context.getBean(List.class);
        List addProd = context.getBean(List.class);
        List delProd = context.getBean(List.class);

        System.out.println(createProduct);
        System.out.println(addProd);
        System.out.println(delProd);


    }
}
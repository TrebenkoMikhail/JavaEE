package lesson2;

import java.util.ArrayList;
import java.util.List;

public class Cart extends ProductRepository  {

    Cart cart = new Cart();
    public List addProd() {
        List<Product> products = new ArrayList<>();
        try {
            products.add(new Product(6));
            System.out.println("Product is created!");
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return products;
    }

        public List delProd() {
        List<Product> products = new ArrayList<>();
        products.remove(7);
        System.out.println("Product is removed!");
        return products;
    }
}

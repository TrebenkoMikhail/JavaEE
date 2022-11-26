package lesson2;

import java.util.ArrayList;
import java.util.List;


public class ProductRepository  extends Product{

    public List createProduct(){
        List<Product> products =new ArrayList<>();
        products.add(new Product( 1, "Apple", 10));
        products.add(new Product( 2,"Orange", 10));
        products.add(new Product( 3,"Cherry", 10));
        products.add(new Product( 4,"Peach", 10));
        products.add(new Product( 5,"Banana", 10));
        return products;
    }


}


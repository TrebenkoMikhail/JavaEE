package lesson2;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {
    @Bean
    public List<Product> repositoryProduct () {
        List<Product> products =new ArrayList<>();
        Product product = new Product();
        for (int i = 1; i < 6; i++) {
            product.createNewProduct(i, "Product " + i, 10);
             products.add(product);
        }
        return products;
    }
}


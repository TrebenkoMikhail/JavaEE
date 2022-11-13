package lesson2;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Product  {

        public int id;
        public String title = "Product ";
        private int cost = 10;

    public Product createNewProduct(int id, String title, int cost) {
        Product product = new Product();
        return new Product();
    }
}

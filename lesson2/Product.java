package lesson2;

import lombok.Data;

@Data

public class Product  {

        private int id;
        private String title;
        private int cost = 10;


        public Product(int id) {
                this.id = id;
        }

        public Product(int id, String title, int cost) {
                this.id = id;
                this.title = title;
                this.cost = cost;
        }

        public Product() {

        }
}

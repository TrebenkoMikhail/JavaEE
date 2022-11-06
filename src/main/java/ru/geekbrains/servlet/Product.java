package ru.geekbrains.servlet;

public class Product {

    Product product1 = new Product(1, "Apple", 10);
    Product product2 = new Product(2, "Pineapple", 12);
    Product product3 = new Product(3, "Cherry", 14);
    Product product4 = new Product(4, "Watermelon", 25);
    Product product5 = new Product(5, "Lemon", 3);
    Product product6 = new Product(6, "Orange", 5);
    Product product7 = new Product(7, "Peach", 7);
    Product product8 = new Product(8, "Tomato", 8);
    Product product9 = new Product(9, "Mango", 9);
    Product product10 = new Product(10, "Cucumber", 3);

    public Product(int id, String title, Integer cost) {

    }
        private int id;
        private String title;
        private Integer cost;

        public int getId () {
            return id;
        }

        public void setId ( int id){
            this.id = id;
        }

        public String getTitle () {
            return title;
        }

        public void setTitle (String title){
            this.title = title;
        }

        public Integer getCost () {
            return cost;
        }

        public void setCost (Integer cost){
            this.cost = cost;

    }
}

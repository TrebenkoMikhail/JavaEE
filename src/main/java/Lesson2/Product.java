package Lesson2;

public class Product {

    Product(int id, String title, Integer cost) {

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

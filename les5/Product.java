package les5;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private int price;
    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Product(long l, String apple, int i) {
        List<Product> products = List.of(
                new Product(1, "Apple", 10),
                new Product(2, "Orange", 10),
                new Product(3, "Cherry", 10),
                new Product(4, "Peach", 10),
                new Product(5, "Banana", 10));

            }

    @Override
    public String toString() {
        return "les5.User{" +
                "id=" + id +
                ", name='" + title + '\'' +
                ", score=" + price +
                '}';
    }
}

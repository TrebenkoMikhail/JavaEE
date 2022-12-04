package les5;

import org.hibernate.Session;

import java.util.List;

public interface ProductDao {

    Session findById(Long id);
    Session findByName(String title);

    static void saveOrUpdate() {

    }

    static List<Product> findAll();
}

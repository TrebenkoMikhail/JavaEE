package les5;

import org.hibernate.Session;

import java.util.List;



public class ProductDaoImpl implements ProductDao {

    private SessionFactoryUtil sessionFactoryUtil;

    public ProductDaoImpl(SessionFactoryUtil sessionFactoryUtil) {
        this.sessionFactoryUtil = sessionFactoryUtil;
    }


    @Override
    public Session findById(Long id) {
        Session session = sessionFactoryUtil.getSession();
        try {
            session.beginTransaction();
            session.get(Product.class, id);
            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return session;
    }
    @Override
    public Session findByName(String title) {
        Session session = sessionFactoryUtil.getSession();
        try {
            session.beginTransaction();
            Product product = session.createQuery("select product from Product product where product.title = :title", Product.class)
                    .setParameter("title", title)
                    .getSingleResult();
            session.getTransaction().commit();

        }  catch (Exception e) {
        e.printStackTrace();
    }
        return session;
    }
    @Override
    public List<Product> findAll() {
        Session session = sessionFactoryUtil.getSession();
        try {
            session.beginTransaction();
            List<Product> products = session.createQuery("select product from Product product").getResultList();
            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return (List<Product>) session;
    }

    public Session saveOrUpdate(Product product, String title) {
        Session session = sessionFactoryUtil.getSession();
        try {
            session.beginTransaction();
            session.saveOrUpdate(product);
            session.get(Product.class, title);
            product.setTitle(title);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return session;
    }

}

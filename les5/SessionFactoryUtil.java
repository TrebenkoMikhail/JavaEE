package les5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;


public class SessionFactoryUtil {

    private static SessionFactory factory;
    public void init() {
        factory = new Configuration()
                .configure("hibernate.cfx.xml")
                .buildSessionFactory();
    }

    public Session getSession(){
        return factory.getCurrentSession();
    }
    public void shutdown() {
        if (factory != null) {
            factory.close();
        }
    }
}

package les5;

public class MainApp {

    public static void main(String[] args) {

        SessionFactoryUtil sessionFactoryUtil = new SessionFactoryUtil();
        sessionFactoryUtil.init();

            try{
                ProductDao productDao = new ProductDaoImpl(sessionFactoryUtil);
                productDao.findById(1L);
                productDao.findByName("Apple");
                ProductDao.findAll();
                ProductDao.saveOrUpdate();
                System.out.println(ProductDao.class);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                sessionFactoryUtil.shutdown();
            }

    }
}

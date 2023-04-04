package demo;

import demo.model.Cart;
import demo.model.Product;
import demo.repo.CartDao;
import demo.repo.ProductDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {


    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("demo");

        ProductDao productDao = applicationContext.getBean(ProductDao.class);
        CartDao cartDao = applicationContext.getBean(CartDao.class);

        Cart cart1 = new Cart();
        cart1.setId(1);
        Cart cart2 = new Cart();
        cart2.setId(2);

        Product product1 = new Product();
        product1.setName("Apple");
        product1.setPrice(16.5);
        product1.setCartId(1);
        Product product2 = new Product();
        product2.setName("Banana");
        product2.setPrice(105.3);
        product2.setCartId(1);

        System.out.println(cartDao.add(cart1));
        System.out.println(cartDao.add(cart2));

        productDao.add(product1);
        productDao.add(product2);

        productDao.remove(product2);
        System.out.println(cartDao.getById(1));

        applicationContext.close();
    }
}

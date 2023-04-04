package demo.repo;


import demo.model.Cart;
import demo.model.Product;

public interface CartDao {

    void remove(Cart cart);

    Cart add(Cart cart);

    Cart getById(int id);

}

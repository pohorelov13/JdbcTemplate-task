package demo.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Cart {
    private int id;
    private List<Product> productList;

    public Cart() {
        this.productList = new ArrayList<>();
    }
}

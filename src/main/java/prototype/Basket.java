package prototype;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    final private String name;
    final private Product[] product;
    final private List<Product> products = new ArrayList<>();

    public Basket(final String name,Product... product) {
        this.name = name;
        this.product = product;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product[] getProduct() {
        return product;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String s = "   List [" + name + "]";
        for(Product product : products) {
            s = s + "\n" + product.toString();
        }
        return s;
    }
}

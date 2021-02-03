package prototype;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    final private String name;
    final private List<Product> products = new ArrayList<>();

    public Basket(final String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
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

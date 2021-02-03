package prototype;

public class Product {

    final private String name;
   // final private double price;

    public Product(final String name) {
        this.name = name;
      //  this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "      Product [" + name + "]";
    }
}
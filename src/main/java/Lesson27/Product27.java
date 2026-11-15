package main.java.Lesson27;

public class Product27 implements Cloneable {
    public String name;
    public double price;
    public String category;

    public Product27(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override 
    public Product27 clone() {
        try {
            return (Product27) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override 
    public String toString() {
        return "Product name: '" + name + "', price: " + price + ", category: " + category + ".";
    }
}

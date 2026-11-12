public class Product26 {
    private String name;
    private double price;
    private String category;

    public Product26(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override 
    public String toString() {
        return "Product {name = '" + name + "', price = " + price + ", category = '" + category + "'}";
    }
}

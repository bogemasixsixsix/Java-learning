package main.java.Lesson26;

public class Task26_3 {
    public static void main(String[] args) {
        Product26[] dnsShop = {
            new Product26("Macbook", 129999.0, "Electronics"),
            new Product26("iPhone", 89999.0, "Electronics"),
            new Product26("iPad", 82999.0, "Electronics")
        };

        for (Product26 product : dnsShop) {
            System.out.println(product);
        }
    }
}

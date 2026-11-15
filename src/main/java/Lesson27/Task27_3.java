package main.java.Lesson27;

public class Task27_3 {
    public static void main(String[] args) {
        Product27 macbook = new Product27("Macbook 14", 54500, "Electronics");

        Product27 imac = macbook.clone();
        
        System.out.println(macbook);
        System.out.println(imac);

        imac.name = "iMac";
        imac.price = 96900;
        imac.category = "Computers";
        
        System.out.println(macbook);
        System.out.println(imac);
    }
}

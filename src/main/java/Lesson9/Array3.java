package main.java.Lesson9;
public class Array3 {
    public static void main(String [] arg) {
        String text = "Hello World!";
        
        String part1 = text.substring(0, 5);
        System.out.println(part1);

        int position = text.indexOf("W");
        System.out.println("Position of W in 'Hello World! is: " + position);

        String upper = text.toUpperCase();
        System.out.println(upper);
    } 
}

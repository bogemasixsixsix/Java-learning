package main.java.Lesson9;
public class Array {
    public static void main(String[] args) {
        String str1 = "Java Programming";
        System.out.println(str1);

        String str2 = "Hello";
        String str3 = "World";
        String sup = str2 + " " + str3;
        System.out.println(sup);

        String str4 = "Apple";
        String str5 = "apple";
        boolean isEqual = str4.equals(str5);
        System.out.println("Is strings equal?: " + isEqual);
    }
}

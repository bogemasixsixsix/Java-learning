package main.java.Lesson15;
public class Task15_1 {
    public static int multiply (int a, int b) {
        return a * b;
    }

    public static boolean isEven (int a) {
        return a % 2 == 0;
    }

    public static void main(String[] args) {
        int multi = multiply(5,6);
        boolean evenor = isEven(multi);

        System.out.println("The multiply is " + multi + ". Is it even number? " + evenor);
    }
}

package main.java.Lesson12;
public class Task12_1 {
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }


    public static void main(String[] args) {
        int multi = multiply(4, 6);
        System.out.println("Mutliply is: " + multi);

        boolean evenor = isEven(5);
        System.out.println("Number is eveN? Answer: " + evenor);
    }   
}
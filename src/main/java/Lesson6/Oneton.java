package main.java.Lesson6;
public class Oneton {
    public static void main(String[] args) {
        int n = 6;
        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);
    }
}
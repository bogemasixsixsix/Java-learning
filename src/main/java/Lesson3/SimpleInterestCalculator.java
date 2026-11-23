package main.java.Lesson3;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        int principal = 1000;
        int rate = 5;
        int time = 3;
        int interest = (principal * rate * time / 100);
        System.out.println("Interest: " + interest);
    }
}
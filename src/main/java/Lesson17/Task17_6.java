package main.java.Lesson17;

public class Task17_6 {
    public static void main(String[] args) {
        int[] numbers = {11, -22, 44, -66, 1, -12, -35};
        int positive = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0) {
                positive++;
            }
        }
        System.out.println("Positive numbers count is: " + positive);
    }
}

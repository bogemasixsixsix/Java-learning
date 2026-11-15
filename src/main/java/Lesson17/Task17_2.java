package main.java.Lesson17;

public class Task17_2 {
    public static void main(String[] args) {
        int[] numbers = {55, 11, 511, 234, 8788};
        int max = numbers[0];
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Max number is: " + max);

    }
}

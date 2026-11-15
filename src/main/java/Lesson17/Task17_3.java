package main.java.Lesson17;

public class Task17_3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int even = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even++;
            }
        }
        System.out.println("Even numbers: " + even);
    }
}

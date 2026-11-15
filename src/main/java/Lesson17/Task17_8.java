package main.java.Lesson17;

public class Task17_8 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] reverse = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            reverse[i] = numbers[numbers.length - 1 - i];
        }
        System.out.println("Original is: " + java.util.Arrays.toString(numbers));
        System.out.println("Reversed is: " + java.util.Arrays.toString(reverse));
    }
}
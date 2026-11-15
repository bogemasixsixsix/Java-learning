package main.java.Lesson20;

public class Task20_5 {
    public static void main(String[] args) {
        int[] nums = {3, 7, 2, 7, 9, 3, 8, 5, 3, 8};

        System.out.println("Array is: " + java.util.Arrays.toString(nums));
        System.out.println("Duplicates: ");

        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == currentNumber) {
                    count++;
                }
            }

            boolean firstSeen = true;
            for (int k = 0; k < i; k++) {
                if (nums[k] == currentNumber) {
                    firstSeen = false;
                    break;
                }
            }

            if (count > 1 && firstSeen) {
                System.out.println("- Number " + currentNumber + " appears " + count + " times");
            }
        }
    }
}
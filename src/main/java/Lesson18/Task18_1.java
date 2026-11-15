package main.java.Lesson18;

public class Task18_1 {
    public static void main(String[] args) {
        int[] nums = {12, 44, 51, 11, 24, 65};
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                sum += nums[i];
            }
        }
        System.out.println("The sum of massive is: " + sum);
    }
}

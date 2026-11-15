package main.java.Lesson19;

public class Task19_6 {
    public static void main(String[] args) {
        int[] nums = {15, 3, 27, 8, 42, 1, 9, 33,  42, 42, 33, 11, 42, 41, 40, 42};
        int maxNum = 0;

        int[] positions = new int[nums.length];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxNum) {
                maxNum = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == maxNum) {
                positions[count] = i;
                count++;
            }
        }
        
        System.out.println("The max number is: " + maxNum);
        System.out.print("Positions: ");
        for (int i = 0; i < count; i++) {
            System.out.print(positions[i] + " ");
        }
        System.out.println("(total " + count + " positions)");
    }
}

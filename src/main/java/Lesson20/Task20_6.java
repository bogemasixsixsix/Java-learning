package main.java.Lesson20;

public class Task20_6 {
    public static void main(String[] args) {
        int[] nums = {3, 7, 2, 7, 9, 3, 1, 5, 3, 8};
        
        System.out.println("Array: " + java.util.Arrays.toString(nums));
        System.out.println("Duplicates:");

        boolean[] processed = new boolean[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (!processed[i]) {
                int currentNum = nums[i];
                int count = 0;

                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == currentNum) {
                        count++;
                    }
                }

                if (count > 1) {
                    System.out.println("- Number " + currentNum + " appears " + count + " times");
                }

                for (int k = 0; k < nums.length; k++) {
                    if (nums[k] == currentNum) {
                        processed[k] = true;
                    }
                }
            }
        }
    }
}

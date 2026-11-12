public class Task20_7 {
    public static void main(String[] args) {
        int[] nums = {45, 12, 78, 3, 67, 12, 91, 3, 45, 22, 78, 3};
        int maxNum = nums[0];
        int maxPos = 0;
        int minNum = nums[0];
        int minPos = 0;
        double sum = 0;

        boolean[] checked = new boolean[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (maxNum < nums[i]) {
                maxNum = nums[i];
                maxPos = i;
            }
            if (minNum > nums[i]) {
                minNum = nums[i];
                minPos = i;
            }
        }
        double avg = sum / nums.length;

        System.out.println("- The max number is: " + maxNum + " and its position is " + maxPos);
        System.out.println("- The min number is: " + minNum + " and its position is " + minPos);
        System.out.println("- Total elements is: " + nums.length);
        System.out.println("- Average is: " + avg);
        System.out.println("- Duplicates: ");

        for (int i = 0; i < nums.length; i++) {
            if (!checked[i]) {
                int currentNum = nums[i];
                int count = 0;

                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == currentNum) {
                        count++;
                    }
                }

                if (count > 1) {
                    System.out.println("* Number " + currentNum + " appears " + count + " times");
                }

                for (int k = 0; k < nums.length; k++) {
                    if (nums[k] == currentNum) {
                        checked[k] = true;
                    }
                }
            }
        }
    }
}

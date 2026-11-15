public class Task20_1 {
    public static void main(String[] args) {
        int[] nums = {41, 66, 21, 45, 22, 99};
        int maxNum = nums[0];
        int minNum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxNum) {
                maxNum = nums[i];
            }
            if (nums[i] < minNum) {
                minNum = nums[i];
            }
        }
        System.out.println("Max number is: " + maxNum +", min number is: " + minNum);
    }
}
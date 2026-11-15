public class Task19_5 {
    public static void main(String[] args) {
        int[] nums = {15, 3, 27, 8, 42, 1, 9, 33};
        int maxNum = 0;

        int[] position = new int[nums.length];
        int pos = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxNum) {
                maxNum = nums[i];
                position[pos] = i;
                count++;
                pos++;
            }
        }
        if (count > 0) {
            System.out.println("The max number is: " + maxNum + ", and its position is: " + pos);
        }
    }
}

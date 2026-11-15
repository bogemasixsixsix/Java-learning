public class Task20_2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 1, 4, 1, 5, 1};
        int searchNumber = 1;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == searchNumber) {
                count++;
            }
        }
        System.out.println("The number " + searchNumber + " is found " + count + " times");
    }
}

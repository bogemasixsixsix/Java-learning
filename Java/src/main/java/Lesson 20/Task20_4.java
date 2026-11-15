public class Task20_4 {
    public static void main(String[] args) {
        int[] nums = {12, 45, 3, 78, 22, 65, 9, 41};
        double sum = 0;

        int[] highNums = new int[nums.length];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        double avg = sum / nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > avg) {
                highNums[count] = nums[i];
                count++;
            }
        }

        System.out.println("An average number is: " + avg);
        System.out.print("A higher than average numbers is: ");
        for (int i = 0; i < count; i++) {
            System.out.print(highNums[i] + " ");
        }
    }
}
public class Task18_3 {
    public static void main(String[] args) {
        int[] nums = {1, 55, 24, 66};
        double sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        double avg = sum/nums.length;
        System.out.println(avg);
    }
}

public class Task18_6 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 3, 5};
        boolean isEqual = false;
        
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != nums2[i]) {
                isEqual = false;
            }
            else {
                isEqual = true;
            }
        }
        System.out.println("Is massives equals? - " + isEqual);
    }
}
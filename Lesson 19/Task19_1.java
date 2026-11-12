public class Task19_1 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int searchValue = 4;
        boolean isFound = false;

        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == searchValue) {
                isFound = true;
                System.out.println("Value " + searchValue + " is found in the array.");
                break;
            }
        }
        if (!isFound) {
            System.out.println("Value " + searchValue + " is not found in the array.");
        }
    }
}
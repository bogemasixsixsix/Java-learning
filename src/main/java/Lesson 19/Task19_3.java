public class Task19_3 {
    public static void main(String[] args) {
        int[] nums1 = {5, 5, 3, 4, 5, 7, 2, 5};
        int searchValues = 5;

        int[] positions = new int[nums1.length];
        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == searchValues) {
                positions[count] = i;
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Found at position: ");
            for (int i = 0; i < count; i++) {
                System.out.println(positions[i] + " ");
            }
            System.out.println("(total " + count + " results)");
        } else {
            System.out.println("Element not found");
        }
    }
}

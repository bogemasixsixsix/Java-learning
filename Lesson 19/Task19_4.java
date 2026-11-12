import java.util.Scanner;

public class Task19_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums1 = {3, 7, 2, 7, 9, 7, 1, 5, 7, 8};
        
        int[] positions = new int[nums1.length];
        int count = 0;
        
        System.out.print("Enter your digit: ");
        int userDigit = scanner.nextInt();

        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == userDigit) {
                positions[count] = i;
                count++;
            }
        }
        if (count > 0) {
            System.out.print("Found at positions: ");
            for (int i = 0; i < count; i++) {
                System.out.print(positions[i] + " ");
            }
            System.out.print("(total " + count + " results)");
        } else {
            System.out.println("Digit not found");
        }
        scanner.close();
    }
}

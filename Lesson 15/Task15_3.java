import java.util.Scanner;

public class Task15_3 {
    public static int calculateSum (int a, int b) {
        return a * b;
    }

    public static boolean isPositive (int a) {
        return a >= 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstnumber = scanner.nextInt();
        
        System.out.print("Enter second nubmber: ");
        int secondnumber = scanner.nextInt();

        int sum = firstnumber + secondnumber;
        boolean positive = isPositive(sum);

        System.out.println("Your sum is: " + sum + ". Is it positive? " + positive);

        scanner.close();
    }
}

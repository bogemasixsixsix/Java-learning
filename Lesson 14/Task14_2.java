import java.util.Scanner;

public class Task14_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int first = scanner.nextInt();

        System.out.print("Enter 2nd number: ");
        int second = scanner.nextInt();

        int sum = first + second;
        System.out.println("The sum is: " + sum);

        scanner.close();
    }
}

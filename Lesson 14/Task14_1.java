import java.util.Scanner;

public class Task14_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write yo name: ");
        String name = scanner.nextLine();

        System.out.print("Enter yo age: ");
        String age = scanner.nextLine();

        System.out.println("Hi, " + name + ", yo age is: " + age);

        scanner.close();
    }
}

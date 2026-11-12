import java.util.Scanner;

public class Task14_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, what is yo name?");
        String name = scanner.nextLine();

        System.out.println("And your age?");
        int age = scanner.nextInt();

        System.out.println("Hello, " + name + ", you are " + age);

        scanner.close();
    }
}

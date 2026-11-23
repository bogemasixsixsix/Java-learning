package main.java.Lesson14;
import java.util.Scanner;

public class Task14_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter yo name: ");
        String name = scanner.nextLine();

        System.out.print("Enter yo age: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println(name + ", you are an adult");
        }
        else {
            System.out.println(name + ", you are a minor");
        }
        scanner.close();
    }
}
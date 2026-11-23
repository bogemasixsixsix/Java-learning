package main.java.Lesson14;
import java.util.Scanner;

public class Task14_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter yo name: ");
        String name = scan.nextLine();

        System.out.print("Hi, " + name + ", enter yo number: ");
        int num = scan.nextInt();
        if (num > 5) {
            System.out.println("The number is too high");
        }
        else {
            System.out.println("Yo number is oki");
        }

        scan.close();
    }
}

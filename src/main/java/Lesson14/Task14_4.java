package main.java.Lesson14;
import java.util.Scanner;

public class Task14_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Write first number:");
        int first = scanner.nextInt();

        System.out.print("Write second number:");
        int second = scanner.nextInt();
        int sum = first + second;

        System.out.print("The sum is: " + sum);

        scanner.close();
    }
}

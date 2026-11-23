package main.java.Lesson10;
public class Task10_2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 9; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

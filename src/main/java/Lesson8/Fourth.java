package main.java.Lesson8;
public class Fourth {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                int result = i + j;
                if (result == 5) {
                    break;
                }
                System.out.println(i + " + " + j + " = " + result);
            }
        }
    }
}
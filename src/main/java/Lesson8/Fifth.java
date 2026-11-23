package main.java.Lesson8;
public class Fifth {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                int result = i + j;
                if (result % 2 == 0) {
                    continue;
                }
                System.out.println(i + " + " + j + " = " + result);
            }
        } 
    }
}

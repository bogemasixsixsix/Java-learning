public class Multitable {
    public static void main (String[] args) {
        for (int i = 2; i <= 4; i++) {
            for (int j = 1; j <= 3; j++) {
                int result = i * j;
                System.out.println(i + " x " + j + " = " + result);
            }
        }
    }
}

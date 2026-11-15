public class Sixth {
    public static void main(String[] args) {
        outer:
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int sum = i + j;
                if (sum % 7 == 0 && sum < 50) {
                    System.out.println("Found: " + sum);
                    break outer;
                }
            }
        }
    }
}

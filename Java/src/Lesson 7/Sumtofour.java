public class Sumtofour {
    public static void main(String[] args) {
        int n = 4;
        int sum = 0;

        for (int i = 1; i <=n; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);
    }
}

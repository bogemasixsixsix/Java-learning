public class Table {
    public static void main(String[] args) {
        for (int multiplier = 1; multiplier <= 3; multiplier++) {
            for (int multiplicand = 1; multiplicand <= 3; multiplicand++) {
                int result = multiplier * multiplicand;
                System.out.println(multiplier + " x " + multiplicand + " = " + result);
            }
        }
    }
}
public class Task11_2 {
    public static void StudInfo() {
        System.out.println("Имя: Vitaly, Age: 27");
    }

    public static int Sum (int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        StudInfo();
        int sum1 = Sum(4, 5);
        System.out.println("The sum of numers is: " + sum1);
    }
}
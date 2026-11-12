public class Task11_1 {
    public static int multiply (int a, int b) {
        return a * b;
    }
    
    public static int getSquare (int a) {
        return a * a;
    }

    public static boolean isEven (int a) {
        return a % 2 == 0;
    }

    public static void main (String [] args) {
        int result = multiply(4, 5);
        System.out.println("Sum is: " + result);

        int sqr = getSquare(5);
        System.out.println("Square is: " + sqr);

        boolean check = isEven(4);
        System.out.println(check);
    }
}
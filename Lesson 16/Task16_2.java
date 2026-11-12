public class Task16_2 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 33;
        numbers[1] = 11;
        numbers[2] = 22;
        
        System.out.println("The second number is: " + numbers[1]);

        numbers[1] = 67;

        System.out.println("But now second number is: " + numbers[1]);
    }
}

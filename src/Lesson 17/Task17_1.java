public class Task17_1 {
    public static void main(String[] args) {
        int[] numbers = {11, 22, 33, 44};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("The " + i + " number is: " + numbers[i]);
        }

        String[] names = {"Vitaly", "Sanya", "Tamazik", "Rafik"};

        for (int i = 3; i >= 0; i--) {
            System.out.println("Friends names from the end: " + names[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("The sum is: " + sum);
    }
}

public class Task30_1 {
    public static void main(String[] args) {
        Vehicle30_1[] array = {
            new Car30_1(4,5,90),
            new Bicycle30_1(2, 0,41)
        };

        for (Vehicle30_1 vehicle : array) {
            vehicle.startEngine();
            System.out.println("Vehicle speed is: " + vehicle.getSpeed());
        }
    }
}

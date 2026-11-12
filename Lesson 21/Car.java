public class Car {
    String brand;
    double speed;

    public Car(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("Brand is: " + brand);
        System.out.println("Speed is: " + speed);
    }
}
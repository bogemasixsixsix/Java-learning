package main.java.Lesson25;

public class Car25 {
    public String brand;
    private int speed;

    public Car25(String brand) {
        this.brand = brand;
        this.speed = 25;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        }
    }
    
    public void displayInfo() {
        System.out.println("Car brand: " + brand);
        System.out.println("Car speeed: " + speed + "\n");
    }
}

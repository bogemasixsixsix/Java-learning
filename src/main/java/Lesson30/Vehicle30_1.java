package main.java.Lesson30;

public class Vehicle30_1 {
    protected int wheels;
    protected int doors;
    protected int speed;

    public Vehicle30_1(int wheels, int doors, int speed) {
        this.wheels = wheels;
        this.doors = doors;
        this.speed = speed;
    }

    public int getSpeed() {
    return speed;
    }

    public void startEngine() {
        System.out.println("Vehicle engine started");
    }
}
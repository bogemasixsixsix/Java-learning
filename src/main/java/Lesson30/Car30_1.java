package main.java.Lesson30;

public class Car30_1 extends Vehicle30_1 {
    
    public Car30_1(int wheels, int doors, int speed) {
        super(wheels, doors, speed);
    }


    @Override 
    public void startEngine() {
        System.out.println("Car engine started");
    }
}

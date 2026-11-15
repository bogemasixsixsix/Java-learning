package main.java.Lesson30.Lesson30repeat;

public class ElectricCar30r_1 extends Car30r_1{
    public ElectricCar30r_1(String brand) {
        super(brand);
    }

    @Override 
    public void drive() {
        System.out.println(brand + " accelerate so fast, cause its tesla lol.");
    }
}

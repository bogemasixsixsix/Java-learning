package main.java.Lesson28;

public class Car28_1_1 extends Vehicle28_1 {
    protected int doors;

    public Car28_1_1(String brand, String model, int doors) {
        super(brand, model);
        this.doors = doors;
    }

    public void openTrunk() {
        System.out.println(model + " opened trunk.");
    }
}
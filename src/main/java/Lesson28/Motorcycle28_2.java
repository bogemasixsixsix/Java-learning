package main.java.Lesson28;

public class Motorcycle28_2 extends Vehicle28_1 {
    protected double engineSize;

    public Motorcycle28_2(String brand, String model, double engineSize) {
        super(brand, model);
        this.engineSize = engineSize;
    }

    public void wheelie() {
        System.out.println(model + " is doin wheelie! \n");
    }

    @Override 
    public void startEngine() {
        System.out.println(model + " engine is roaring! \n");
    }
}

public class Bike30r_1 extends Vehicle30r_1{
    protected int gears;
    public Bike30r_1(String brand, int gears) {
        super(brand);
        this.gears = gears;
    }

    @Override 
    public void drive() {
        System.out.println("Bicycle branded as: '" + brand + "' rides the way with " + gears + " gears.");
    }
}

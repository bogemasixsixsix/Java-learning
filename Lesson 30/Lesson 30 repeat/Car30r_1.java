public class Car30r_1 extends Vehicle30r_1{
    public Car30r_1(String brand) {
        super(brand);
    }

    @Override 
    public void drive() {
        System.out.println(brand + " rides so fast at highway!");
    }
}

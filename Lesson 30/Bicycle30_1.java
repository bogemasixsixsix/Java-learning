public class Bicycle30_1 extends Vehicle30_1 {
    
    public Bicycle30_1(int wheels, int doors, int speed) {
        super(wheels, doors, speed);
    }


    @Override 
    public void startEngine() {
        System.out.println("Bicycle pedal power");
    }
}

public class Vehicle28_1 {
    protected String brand;
    protected String model;

    public Vehicle28_1(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void startEngine() {
        System.out.println(model + " starting engine... \n");
    }
}
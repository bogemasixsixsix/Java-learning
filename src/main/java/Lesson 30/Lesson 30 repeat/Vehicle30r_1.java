public class Vehicle30r_1 {
    protected String brand;

    public Vehicle30r_1(String brand) {
        this.brand = brand;
    }

    public void drive() {
        System.out.println(brand + " rides the way.");
    }

    public static void printBrand() {
        System.out.println("printBrand");
    };
}

public class Task28_2 {
    public static void main(String[] args) {
        Motorcycle28_2 streetfighter = new Motorcycle28_2("Ducati", "Streetfighter", 1.1);
        
        streetfighter.startEngine();
        streetfighter.wheelie();

        Vehicle28_1[] things = {
            new Vehicle28_1("Toyota", "Camry"),
            new Car28_1_1("Hyundai", "Solaris", 5),
            new Motorcycle28_2("Ducati", "848", 0.848)
        };

        for (Vehicle28_1 thing : things) {
            thing.startEngine();
        }
    }
}

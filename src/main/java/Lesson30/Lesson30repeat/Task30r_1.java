package main.java.Lesson30.Lesson30repeat;

public class Task30r_1 {
    public static void main(String[] args) {
        
    Vehicle30r_1[] garage = {
        new Bike30r_1("Ducati", 5),
        new Vehicle30r_1("Audi"),
        new Car30r_1("Mercedes"),
        new ElectricCar30r_1("Tesla")
    };

    for(Vehicle30r_1 vehicle : garage) {
        vehicle.drive();
//        Vehicle30r_1.printBrand(vehicle);
    }
    
    }
}

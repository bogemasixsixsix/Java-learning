public class Circle23 {
    double radius;
    String color;

    public Circle23() {
        this.radius = 1.0;
        this.color = "White";
    }

    public Circle23(double radius) {
        this.radius = radius;
        this.color = "White";
    }

    public Circle23(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Radius: " + radius);
        System.out.println("Color: " + color);
        System.out.println("Square: " + (3.14 * radius * radius) + "\n");
    }
}

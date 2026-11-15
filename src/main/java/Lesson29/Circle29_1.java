package main.java.Lesson29;

public class Circle29_1 extends Shape29_1 {
    public Circle29_1(double a) {
        this.a = a;
    }

    @Override 
    public void draw() {
        System.out.println("Circle extended");
    }

    @Override
    public double getArea() {
        return  Math.PI * a * a;
    }

    public double perimeter() {
        return 2 * Math.PI * a;
    }
}

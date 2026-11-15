package main.java.Lesson29;

public class Rectangle29_1 extends Shape29_1 {
    public Rectangle29_1(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle extended");
    }
    
    @Override
    public double getArea() {
        return a * b;
    }

    public double perimeter() {
        return a + b;
    }
}

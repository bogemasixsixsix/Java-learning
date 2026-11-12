public class Task29_1 {
    public static void main(String[] args) {
        Shape29_1[] shape1 = {new Rectangle29_1(4,5), new Circle29_1(8)};

        renderAll(shape1);
        System.out.println("The total area is: " + getTotalArea(shape1));
        System.out.println("The sum perimeter is: " + getTotalLength(shape1));
    }

    public static void renderAll(Shape29_1[] shapes) {
        for (Shape29_1 shape : shapes) {
            shape.draw();
            if (shape instanceof Rectangle29_1) {
                System.out.println("Rectangle area is: " + shape.getArea());
            } else if (shape instanceof Circle29_1) {
                System.out.println("Circle area is: " + shape.getArea());
            }
        }
    }

    public static double getTotalArea(Shape29_1[] shapes) {
        double total = 0;
        for (Shape29_1 shape : shapes) {
            total += shape.getArea();
        }
        return total;
    }

    public static double getTotalLength(Shape29_1[] shapes) {
        double totalLength = 0;
        for (Shape29_1 shape : shapes) {
            totalLength += shape.perimeter();
        }
        return totalLength;
    }
}
package ua.ithillel.homework.lesson13;

public class DemoShape {
    public static void main(String[] args) {
        GeometricShape[] shape = new GeometricShape[]{
                new Circle(2),
                new Square(2),
                new Triangle(2, 2)
        };
        double total = totalArea(shape);
        System.out.println(total);

    }

    public static double totalArea(GeometricShape[] shape) {
        double sum = 0;
        for (int i = 0; i < shape.length; i++) {
            sum += shape[i].areaShape();
        }
        return sum;
    }
}
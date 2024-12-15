package ua.ithillel.homework.lesson13;

public class Triangle implements GeometricShape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double areaShape() {
        return 0.5 * base * height;
    }
}
package ua.ithillel.homework.lesson13;

public class Circle implements GeometricShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double areaShape() {
        return Math.PI * radius * radius;
    }
}
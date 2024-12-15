package ua.ithillel.homework.lesson13;

public class Square implements GeometricShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double areaShape() {
        return side * side;
    }
}
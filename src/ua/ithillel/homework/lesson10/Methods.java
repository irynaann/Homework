package ua.ithillel.homework.lesson10;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Введіть ціле число: ");
        int num = scanner.nextInt();
        int squareNumber = calculateSquare(num);
        System.out.println("Квадрат числа " + num + " дорівнює " + squareNumber + ".");
        System.out.println("2. Введіть радіус: ");
        double radius = scanner.nextDouble();
        System.out.println("Введіть висоту: ");
        double height = scanner.nextDouble();
        double result = volumeCylinder(radius, height);
        System.out.println("2. Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + result + ".");

    }

    public static int calculateSquare(int num) {
        int result = num * num;
        return result;
    }

    public static double volumeCylinder(double radius, double height) {
        double result = 3.14 * (radius * radius) * height;
        return result;
    }

}

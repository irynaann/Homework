package ua.ithillel.homework.lesson10;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ціле число: ");
        int num = scanner.nextInt();
        System.out.printf("Квадрат числа %d дорівнює %d.", num, calculateSquare(num));
        System.out.println();
        System.out.println("Введіть радіус: ");
        double radius = scanner.nextDouble();
        System.out.println("Введіть висоту: ");
        double height = scanner.nextDouble();
        System.out.printf("Об'єм циліндра з радіусом %.1f і висотою %.1f дорівнює %f.",
                radius, height, volumeCylinder(radius, height));
        System.out.println();
        System.out.println("Введіть довжину масиву: ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        System.out.print("Масив чисел: [");
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(0, 101);
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
        System.out.printf("Cума всіх елементів масиву дорівнює: %d.", addSum(array));
        System.out.println();
        scanner.nextLine();
        System.out.println("Введіть рядок: ");
        String line = scanner.nextLine();
        System.out.println("Рядок в зворотньому порядку: " + reverseLine(line));
        System.out.println("Введіть а: ");
        int a = scanner.nextInt();
        System.out.println("Введіть b: ");
        int b = scanner.nextInt();
        System.out.printf("Результат %d ^ %d дорівнює %d.",
                a, b, doExponentiation(a, b));
        System.out.println();
        System.out.println("Введіть ціле число n: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введіть текстовий рядок: ");
        String text = scanner.nextLine();
        printText(n, text);
    }

    public static int calculateSquare(int num) {
        return num * num;
    }

    public static double volumeCylinder(double radius, double height) {
        return 3.14 * (radius * radius) * height;
    }

    public static int addSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static String reverseLine(String line) {
        StringBuilder stringBuilder = new StringBuilder(line);
        return stringBuilder.reverse().toString();
    }

    public static int doExponentiation(double a, double b) {
        double result = Math.pow(a, b);
        return (int) result;
    }

    public static void printText(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
}
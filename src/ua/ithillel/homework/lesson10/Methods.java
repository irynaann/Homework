package ua.ithillel.homework.lesson10;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("1. Введіть ціле число: ");
//        int num = scanner.nextInt();
//        int squareNumber = calculateSquare(num);
//        System.out.println("Квадрат числа " + num + " дорівнює " + squareNumber + ".");
//        System.out.println("2. Введіть радіус: ");
//        double radius = scanner.nextDouble();
//        System.out.println("Введіть висоту: ");
//        double height = scanner.nextDouble();
//        double result = volumeCylinder(radius, height);
//        System.out.println("2. Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + result + ".");
//        System.out.println("Введіть довжину масиву: ");
//        int array = scanner.nextInt();
//        int [] a = new int [array];
//        System.out.println("Масив чисел: ");
//        for (int i = 0; i < a.length; i++) {
//            a[i] = ThreadLocalRandom.current().nextInt(0,101);
//            System.out.println(a[i]);
//        }
//        int sumArray = addSum(a);
//        System.out.println("Cума всіх елементів масиву дорівнює: " + sumArray);
//        System.out.println("Введіть рядок: ");
//        String line = scanner.nextLine();
//        System.out.println("Введіть а: ");
//        int a = scanner.nextInt();
//        System.out.println("Введіть b: ");
//        int b = scanner.nextInt();
//        System.out.println("Результат 2^3 дорівнює " + method5(a, b));
//        System.out.println("Введіть ціле число: ");
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Введіть текстовий рядок: ");
//        String userText = scanner.nextLine();
//        output(userText);
//        method6(n, userText);

        System.out.println("Введіть рядок: " );
        String line = scanner.nextLine();
        System.out.println("Рядок в зворотньому порядку:" + reverseLine(line));

    }

    public static int calculateSquare(int num) {
        int result = num * num;
        return result;
    }

    public static double volumeCylinder(double radius, double height) {
        double result = 3.14 * (radius * radius) * height;
        return result;
    }

    public static int addSum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;

    }

    public static String reverseLine(String line) {
        StringBuilder stringBuilder = new StringBuilder(line);
        return stringBuilder.reverse().toString();
    }

    public static int method5(double a, double b) {
        double result = Math.pow(a, b);
        return (int) result;
    }

    public static void output(String text) {
        System.out.println(text);
    }

    public static void method6(int n, String text) {
        for (int i = 1; i < n; i++) {
            System.out.println(text);
        }

    }
}

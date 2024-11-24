package ua.ithillel.homework.lesson07;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add value: ");
        int value = scanner.nextInt();

        int[] num = new int[value];
        System.out.print("Елементи масиву: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = ThreadLocalRandom.current().nextInt(-100, 101);
            System.out.print(num[i] + " ");
        }
        System.out.println();

        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) {
                sum += num[i];
            }
        }
        System.out.print("Cума від'ємних чисел: " + sum);
        System.out.println();
        System.out.print("Кількість парних чисел: ");
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                count += num.length;
                System.out.print(count + " ");
            }
        }
        System.out.println();
        System.out.print("Кількість непарних чисел: ");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                count += num.length;
                System.out.print(count + " ");
            }
        }
        System.out.println();
        int min = 0;
        int max = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
                System.out.print("Найменший елемент: " + min + " з індексом " + i);
            }
        }
        System.out.println();
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
                System.out.print("Найбільший елемент: " + max + " з індексом " + i);
            }
        }
        System.out.print("Середнє арифметичне чисел після першого від'ємного числа: ");
        int sum2 = 0;
        int average;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
                sum2 += min;
                average = sum2 / num.length;
                System.out.println(average);
            } System.out.println("There are no negative numbers");
        }
    }
}

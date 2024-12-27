package ua.ithillel.homework.lesson07;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add value: ");
        // int value = scanner.nextInt();
        int value = 4;
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
        System.out.println("Cума від'ємних чисел: " + sum);

        int evenCount = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Кількість парних чисел: " + evenCount);

        int oddCount = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Кількість непарних чисел: " + oddCount);

        int min = 0;
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) {
                min = num[i];
                index = i;
            }
        }
        System.out.println("Найменший елемент: " + min + " з індексом " + index);

        int max = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) {
                max = num[i];
                index = i;
            }
        }
        System.out.println("Найбільший елемент: " + max + " з індексом " + index);

        int average = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) {
                for (int j = i + 1; j < num.length; j++)
                    average += num[j];
            }
            break;
        }
        System.out.println(average);
    }
}

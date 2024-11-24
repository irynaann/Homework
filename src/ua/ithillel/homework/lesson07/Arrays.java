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

        int min= 0;
        int minIndex= 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < minIndex) {
                min = num[i];
                minIndex = i;
            }
        }
        System.out.println("Найменший елемент: " + min + " з індексом " + minIndex);

        int max = 0;
        int maxIndex= 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
                maxIndex = i;
            }
        }
        System.out.print("Найбільший елемент: " + max + " з індексом " + maxIndex);

        System.out.print("Середнє арифметичне чисел після першого від'ємного числа: ");
        int sum2 = 0;
        int average;
//        for (int i = 0; i < num.length; i++) {
//            if (num[i] < min) {
//                min = num[i];
//                sum2 += min;
//                average = sum2 / num.length;
//                System.out.println(average);
//            }
//            System.out.println("There are no negative numbers");
        }
    }



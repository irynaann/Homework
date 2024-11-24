package ua.ithillel.homework.lesson07;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add value: ");
        int value = scanner.nextInt();

        int[] num = new int[value];
        for (int i = 0; i < num.length; i++) {
            num[i] = ThreadLocalRandom.current().nextInt(-100, 101);
            System.out.println(num[i]);
        }
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) {
                sum += num[i];
                System.out.println("Cума від'ємних чисел: " + sum);
            }
        }
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                count += num.length;
                System.out.println("Кількість парних чисел: " + count);
            } else if (num[i] % 2 != 0){
                count += num.length;;
                System.out.println("Кількість непарних чисел: " + count);
            }
        }

    }
}

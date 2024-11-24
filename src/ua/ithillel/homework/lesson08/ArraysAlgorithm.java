package ua.ithillel.homework.lesson08;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArraysAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add array length: ");
        int value = scanner.nextInt();

        int[] array = new int[value];
        System.out.print("Initial array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1,101);
            System.out.print(array[i] + " ");
        }
    }
}

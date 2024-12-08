package ua.ithillel.homework.lesson09;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size: ");
        //int size = scanner.nextInt();
        int size = 4;
        System.out.println("Enter range: ");
        //int range = scanner.nextInt();
        int range = 4;
        System.out.println("Matrix: ");

        int[][] matrix = new int[size][range];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(1, 5);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of elements in even rows: ");
        int evenSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i % 2 == 0) {
                    evenSum += matrix[i][j];
                }
            }
        }
        System.out.println(evenSum);
        System.out.println("Sum of elements in odd rows: ");
        int oddSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i % 2 != 0) {
                    oddSum += matrix[i][j];
                }
            }
        }
        System.out.println(oddSum);
    }
}


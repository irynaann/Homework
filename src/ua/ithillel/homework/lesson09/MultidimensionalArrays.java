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
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(1, 5);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of elements in even rows: " + calculateEvenSum(matrix));
        System.out.println("Sum of elements in odd rows: " + calculateOddSum(matrix));
        System.out.println("Product of elements in even columns: " + calculateEvenProduct(matrix));
        System.out.println("Product of elements in odd columns: " + calculateOddProduct(matrix));
    }

    public static int calculateEvenSum(int[][] matrix) {
        int evenSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 == 0) {
                    evenSum += matrix[i][j];
                }
            }
        }
        return evenSum;
    }

    public static int calculateOddSum(int[][] matrix) {
        int oddSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 != 0) {
                    oddSum += matrix[i][j];
                }
            }
        }
        return oddSum;
    }

    public static int calculateEvenProduct(int[][] matrix) {
        int evenProduct = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j % 2 == 0) {
                    evenProduct *= matrix[i][j];
                }
            }
        }
        return evenProduct;
    }

    public static int calculateOddProduct(int[][] matrix) {
        int oddProduct = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j % 2 != 0) {
                    oddProduct *= matrix[i][j];
                }
            }
        }
        return oddProduct;
    }
}


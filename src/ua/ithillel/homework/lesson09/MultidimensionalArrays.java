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
        // int range = scanner.nextInt();
        int range = 4;
        System.out.println("Matrix: ");

        int[][] matrix = new int[size][range];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(1, 51);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of elements in even rows: " + calculateEvenSum(matrix));
        System.out.println("Sum of elements in odd rows: " + calculateOddSum(matrix));
        System.out.println("Product of elements in even columns: " + calculateEvenProduct(matrix));
        System.out.println("Product of elements in odd columns: " + calculateOddProduct(matrix));
        if (isMagicSquare(matrix)) {
            System.out.println("The matrix is a magic square");
        } else {
            System.out.println("The matrix is not a magic square");
        }
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

    public static boolean isMagicSquare(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix.length != matrix[i].length) {
                return false;
            }
        }
        int targetSum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            targetSum += matrix[0][j];
        }

        for (int i = 1; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }

            for (int j = 0; j < matrix[0].length; j++) {
                int colSum = 0;
                for (i = 0; i < matrix.length; i++) {
                    colSum += matrix[i][j];

                }
            }
            if (targetSum != rowSum || targetSum != rowSum) {
                return false;
            }
        }
        return true;
    }
}
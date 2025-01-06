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
            array[i] = ThreadLocalRandom.current().nextInt(1, 101);
            System.out.print(array[i] + " ");
        }
        for (int i = 1; i < array.length; i++) {
            int currentIndex = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > currentIndex) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = currentIndex;
        }
        System.out.println();
        System.out.print("Sorted array: ");
        for (int arr : array) {
            System.out.print(arr + " ");
        }
        System.out.println();
        System.out.println("Number to search: ");
        int target = scanner.nextInt();
        int result = binarySearch(array, target);
        if (result == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}





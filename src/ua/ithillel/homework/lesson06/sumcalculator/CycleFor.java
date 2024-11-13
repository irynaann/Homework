package ua.ithillel.homework.lesson06.sumcalculator;

import java.util.Scanner;

public class CycleFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter maximum range of numbers: ");
        int maxRange = Integer.MAX_VALUE;
        maxRange = scanner.nextInt();

        int sum = 0;
        for (int num = 1; num <= maxRange; num++) {
            sum += num;
            System.out.println("Num is " + num + " sum is: " + sum);
        }
    }
}

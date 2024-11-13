package ua.ithillel.homework.lesson06.sumcalculator;

import java.util.Scanner;

public class CycleDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter maximum range of numbers: ");
        int maxRange = scanner.nextInt();

        int num = 1;
        int sum = 0;
        do {
            sum += num;
            System.out.println(num + ")" + " Num is "
                    + num + "," + " sum is: " + sum);
            num++;
        } while (num <= maxRange);
        System.out.println("------------------------");
        System.out.println("Sum of numbers is " + sum);
    }
}
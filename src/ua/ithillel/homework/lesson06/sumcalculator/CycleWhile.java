package ua.ithillel.homework.lesson06.sumcalculator;

import java.util.Scanner;

public class CycleWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter maximum range of numbers: ");
        int maxRange = Integer.MAX_VALUE;
        maxRange = scanner.nextInt();

        int num = 1;
        int sum = 0;
        int numeration = 1;
        while (num <= maxRange) {
            sum += num;
            System.out.println(numeration + ")" + " Num is " + num + "," + " sum is: " + sum);
            numeration++;
            num++;
        }
    }
}


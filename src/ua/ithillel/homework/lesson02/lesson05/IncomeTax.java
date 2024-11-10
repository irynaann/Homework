package ua.ithillel.homework.lesson02.lesson05;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter income: ");
        int income = scanner.nextInt();
        System.out.println("Tax rate for income to 10000");
        double rate1 = scanner.nextDouble();
        System.out.println("Tax rate for income from 10000 to 25000");
        double rate2 = scanner.nextDouble();
        System.out.println("Tax rate for income from 25000");
        double rate3 = scanner.nextDouble();
    }
}

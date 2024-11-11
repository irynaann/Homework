package ua.ithillel.homework.lesson05;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter income: ");
        int income = scanner.nextInt();
        double tax;

        if (income <= 10000) {
            tax = income * 2.5 / 100;
            System.out.println("Tax Amount: " + tax);
        } else if (income > 10000 && income <= 25000) {
            tax = income * 4.3 / 100;
            System.out.println("Tax Amount: " + tax);
        } else if (income > 25000) {
            tax = income * 6.7 / 100;
            System.out.println("Tax Amount: " + tax);
        } else {
            System.out.println("Undefined");
        }
    }
}
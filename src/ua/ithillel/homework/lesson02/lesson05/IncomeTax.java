package ua.ithillel.homework.lesson02.lesson05;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter income: ");
        int income = scanner.nextInt();
        double taxRate;

        if (income <= 10000) {
            taxRate = income * 2.5 / 100;
            System.out.println("Tax Amount: " + taxRate);
        } else if (income > 10000 && income <= 25000) {
            taxRate = income * 4.3 / 100;
            System.out.println("Tax Amount: " + taxRate);
        } else if (income > 25000) {
            taxRate = income * 6.7 / 100;
            System.out.println("Tax Amount: " + taxRate);
        } else {
            System.out.println("Undefined");
        }
    }
}

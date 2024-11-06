package ua.ithillel.homework.lesson02.lesson03.lesson04;

public class SalesSum {
    public static void main(String[] args) {
        int productNumber = 1;
        String productName = "smartphone";
        String CURRENCY = "EUR";
        float salesByDay = 2430.68F;
        int totalDays = 5;
        double totalSales = totalDays * salesByDay;
        double averageSalesByday = totalSales / totalDays;
        System.out.printf("Product No %d: %s, %n", productNumber, productName);
        System.out.printf("total sales for %d days is %s %.2f. %n", totalDays, CURRENCY, totalSales);
        System.out.printf("sales by day is %s %.2f.", CURRENCY, averageSalesByday);

        productNumber = 2;
        productName = "laptop";
        salesByDay = 1498.12F;
        totalDays = 7;
    }
}

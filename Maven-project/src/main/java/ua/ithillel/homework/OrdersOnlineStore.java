package ua.ithillel.homework;

public class OrdersOnlineStore {
    public static void main(String[] args) {
        int clientNumber = 1;
        String clientName = "Alice";
        String productName = "smartphone";
        String address = "Moon Street, 10";
        double productPrice = 305.99;
        String CURRENCY = "EUR";
        System.out.println("Order No " + clientNumber + " Client: " + clientName + ".");
        System.out.println("Product: " + productName + ",");
        System.out.println("Product: " + CURRENCY + " " + productPrice + ".");
        System.out.println("Address: " + address);
    }
}

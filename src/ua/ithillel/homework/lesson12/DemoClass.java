package ua.ithillel.homework.lesson12;

public class DemoClass {
    public static void main(String[] args) {
        Car car = new Car();
        Employee employee = new Employee(30, 56664554, "bank@gmail.com", "analytic", "Barbara Braun");
        System.out.println("----Full Name----");
        System.out.println(employee.getFullName());
        System.out.println("----Phone Number----");
        System.out.println(employee.getPhoneNumber());
        System.out.println("----CarDemo----");
        car.start();
        System.out.println("----Stop----");
        car.stop();
    }
}
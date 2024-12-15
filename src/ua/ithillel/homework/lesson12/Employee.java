package ua.ithillel.homework.lesson12;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private int phoneNumber;
    private int age;

    public Employee(int age, int phoneNumber, String email, String position, String fullName) {
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.position = position;
        this.fullName = fullName;
    }

}



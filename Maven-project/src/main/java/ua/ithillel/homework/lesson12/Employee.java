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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
package ua.ithillel.homework.lesson11;

public class Person {
    String name;
    int age;
    String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public String toString() {
        return "Ім'я: " + name + ", Вік: " + age + ", Професія: " + profession;
    }

    public void setProfession(String newProfession) {
        this.profession = newProfession;
    }

    public static void main(String[] args) {
        Person person1 = new Person("John", 30, "Інженер");
        Person person2 = new Person("Mary", 25, "Вчитель");
        Person person3 = new Person("Bob", 35, "Лікар");
        System.out.print("1. ");
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
        System.out.println();
        Person person4 = new Person("Alice", 28, "Архітектор");
        System.out.print("2. ");
        System.out.println(person4.toString());
        person4.setProfession("Дизайнер");
        System.out.println("(Після оновлення професії)");
        System.out.println(person4.toString());
    }
}
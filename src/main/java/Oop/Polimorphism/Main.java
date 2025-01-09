package Oop.Polimorphism;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(12, "Alex");
        Worker w1 = new Worker(12, "John", 10000);

        Person[] persons = new Person[]{p1, w1};
        System.out.println(persons[0].getName());
        System.out.println(persons[1].getName());

        Person p2 = persons[1];
        System.out.println(p2.getName());

    }
}

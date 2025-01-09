package Oop.Polimorphism;

public class Worker extends Person {
    int salary;
    public Worker(int age, String name, int salary) {
        super(age, name);
        this.salary = salary;
    }
    @Override
    public String getName(){
        return "Mr. " + super.getName();
    }

}

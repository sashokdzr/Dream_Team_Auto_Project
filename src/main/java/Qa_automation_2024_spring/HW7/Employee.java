package Qa_automation_2024_spring.HW7;

public class Employee {

    String name;
    int age;
    String gender;
    int salary;

    public Employee(String name, int age, String gender, int salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    boolean isSameName(Employee employee){
        return name.equals(employee.name);
    }
}

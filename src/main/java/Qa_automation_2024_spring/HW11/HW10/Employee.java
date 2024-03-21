package Qa_automation_2024_spring.HW11.HW10;

public abstract class Employee {
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    private String name;
    private double baseSalary;

    public abstract double getSalary();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}

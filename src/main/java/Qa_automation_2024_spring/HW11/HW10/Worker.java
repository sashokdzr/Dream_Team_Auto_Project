package Qa_automation_2024_spring.HW11.HW10;

public class Worker extends Employee {

    public Worker(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public final double getBaseSalary() {
        return super.getBaseSalary();
    }
    @Override
    public double getSalary() {
        return getBaseSalary();
    }

}

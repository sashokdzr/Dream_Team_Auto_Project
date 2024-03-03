package Qa_automation_2024_spring.HW9.Workers;

import Qa_automation_2024_spring.HW9.Months.Month;

public class Manager extends Employee {

    public Manager(int workers, int age, String sex, String name, double salaryPerDay) {
        super(sex, age, name, salaryPerDay);
        this.workers = workers;
    }

    public int getWorkers() {
        return workers;
    }

    public void setWorkers(int workers) {
        this.workers = workers;
    }

    private int workers;
    double getSalary(Month[] monthArray){
        return super.getSalary(monthArray)*(1+0.01*getWorkers());
    }
}

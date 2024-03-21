package Qa_automation_2024_spring.HW11.HW9.Workers;

import Qa_automation_2024_spring.HW11.HW9.Months.Month;

public abstract class BaseEmployee {
    public abstract String getName();
    public abstract void setName(String name);
    public abstract int getAge();
    public abstract void setAge(int age);
    public abstract String getSex();
    public abstract void setSex(String sex);
    public abstract double getSalaryPerDay();
    public abstract void setSalaryPerDay(double salaryPerDay);
    public abstract double getSalary(Month[] monthArray);
    private String name;
    private int age;
    private String sex;
    private double salaryPerDay;
}

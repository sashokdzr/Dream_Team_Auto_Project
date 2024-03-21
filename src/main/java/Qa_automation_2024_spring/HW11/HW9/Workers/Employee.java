package Qa_automation_2024_spring.HW11.HW9.Workers;

import Qa_automation_2024_spring.HW11.HW9.Months.Month;

public final class Employee extends BaseEmployee{
    public Employee(String name, int age, String sex, double salaryPerDay) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salaryPerDay = salaryPerDay;
    }
    @Override
    public int getAge() {
        return age;
    }
    @Override
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String getSex() {
        return sex;
    }
    @Override
    public void setSex(String sex) {
        this.sex = sex;
    }
    @Override
    public double getSalaryPerDay() {
        return salaryPerDay;
    }
    @Override
    public void setSalaryPerDay(double salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public void setName(String name){
        this.name = name;
    }

    private String name;
    private int age;
    private String sex;
    private double salaryPerDay;
    @Override
    public double getSalary(Month[] monthArray){
        double salary = 0.0;
        for (Month i:monthArray){
            salary+=i.getWorkDays()*salaryPerDay;
        }
        return salary;
    }


}

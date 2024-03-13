package Qa_automation_2024_spring.HW9.Workers;

import Qa_automation_2024_spring.HW9.Months.Month;

public class Employee {
    public Employee(String name, int age, String sex, double salaryPerDay) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salaryPerDay = salaryPerDay;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(double salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    private String name;
    private int age;
    private String sex;
    private double salaryPerDay;

    double getSalary(Month[] monthArray){
        double salary = 0;
        for (Month i:monthArray){
            salary+=i.getWorkDays()*salaryPerDay;
        }
        return salary;
    }


}

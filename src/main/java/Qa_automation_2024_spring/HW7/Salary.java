package Qa_automation_2024_spring.HW7;

public class Salary {
    double getSum(Employee[] employeeArray){
        double sum = 0;
        for (Employee i : employeeArray){
            sum +=i.salary;
        }
        return sum;
    }
}

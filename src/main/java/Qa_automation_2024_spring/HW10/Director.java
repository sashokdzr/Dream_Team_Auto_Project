package Qa_automation_2024_spring.HW10;

public class Director extends Manager{
    public Director(String name, double baseSalary, int numberOfSubardinates) {
        super(name, baseSalary, numberOfSubardinates);
    }
    @Override
    public double getPremium() {
        return (getNumberOfSubardinates() * 9.0) / 100;
    }
}

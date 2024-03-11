package Qa_automation_2024_spring.HW10;

public class Manager extends Employee {

    public Manager(String name, double baseSalary, int numberOfSubardinates) {
        super(name, baseSalary);
        this.numberOfSubardinates = numberOfSubardinates;
    }

    public int getNumberOfSubardinates() {
        return numberOfSubardinates;
    }

    public void setNumberOfSubardinates(int numberOfSubardinates) {
        this.numberOfSubardinates = numberOfSubardinates;
    }

    private int numberOfSubardinates;

    public double getPremium() {
        return (getNumberOfSubardinates() * 3.0) / 100;
    }
    @Override
    public double getSalary(){
        if (getNumberOfSubardinates()>0) {
            return getBaseSalary() * (1 + getPremium());
        }
        else return getBaseSalary();
    }
}

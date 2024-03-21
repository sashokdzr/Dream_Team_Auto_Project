package Qa_automation_2024_spring.HW11.HW10;

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

    private final double COEFF = 3.0;
    public double getPremium(double coeff) {
        return (getNumberOfSubardinates() * coeff) / 100;
    }
    @Override
    public double getSalary(){
        if (getNumberOfSubardinates()>0) {
            return getBaseSalary() * (1 + getPremium(COEFF));
        }
        else return getBaseSalary();
    }
}

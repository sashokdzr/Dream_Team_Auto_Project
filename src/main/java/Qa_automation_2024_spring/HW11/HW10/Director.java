package Qa_automation_2024_spring.HW11.HW10;

public final class Director extends Manager {
    public Director(String name, double baseSalary, int numberOfSubardinates) {
        super(name, baseSalary, numberOfSubardinates);
    }
    private final double COEFF = 9.0;
    @Override
    public double getPremium(double coeff) {
        return super.getPremium(COEFF);
    }
}

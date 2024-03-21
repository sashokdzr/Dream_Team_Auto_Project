package Qa_automation_2024_spring.HW11.HW9.License;

public class LicensePlateMaker {
    private String prefix;
    private int lastNumber;

    public LicensePlateMaker(String prefix, int lastNumber) {
        this.prefix = prefix;
        this.lastNumber = lastNumber;
    }

    public LicensePlate makeNextPlate(){
        lastNumber += 1;
        return new LicensePlate(prefix + "-" + lastNumber);

    }
}

package Qa_automation_2024_spring.HW9;

import Qa_automation_2024_spring.HW9.License.LicensePlateMaker;

public class Main {
    public static void main(String[] args) {
        LicensePlateMaker maker1 = new LicensePlateMaker("NY", 2000);
        System.out.println(maker1.makeNextPlate().getPlate());
        System.out.println(maker1.makeNextPlate().getPlate());
        System.out.println(maker1.makeNextPlate().getPlate());
        System.out.println(maker1.makeNextPlate().getPlate());
    }
}

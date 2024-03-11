package Qa_automation_2024_spring.HW10;
public class Main {
    public static void main(String[] args) {

        Employee[] employees = {new Worker("Sergey", 1000),
                new Worker("Maxim", 900),
                new Worker("Ben", 1200),
                new Manager("Ivan", 2000, 1),
                new Manager("Rose", 2200, 2),
                new Director("Petr", 5000, 2)};

        Manager[] managers = {new Manager("Sergey", 1000, 8),
                new Manager("Maxim", 900, 1),
                new Manager("Ben", 7200, 67),
                new Manager("Ivan", 2000, 1),
                new Manager("Rose", 2200, 2),
                new Director("Petr", 5000, 2)};

        System.out.println(EmployeeUtils.findEmployee(employees, "Petr").getSalary());
        System.out.println(EmployeeUtils.findEmployeeByString(employees,"ose").getSalary());
        System.out.println(EmployeeUtils.countSalary(employees));
        System.out.println(EmployeeUtils.getMinSalary(employees));
        System.out.println(EmployeeUtils.getMaxSalary(employees));
        System.out.println(EmployeeUtils.getMaxSubardinates(managers));
        System.out.println(EmployeeUtils.getMinSubardinates(managers));
        System.out.println(EmployeeUtils.getMaxPremium(managers));
        System.out.println(EmployeeUtils.getMinPremium(managers));
    }

}

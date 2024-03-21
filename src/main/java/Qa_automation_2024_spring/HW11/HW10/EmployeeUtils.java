package Qa_automation_2024_spring.HW11.HW10;

public class EmployeeUtils {
    public static Employee findEmployee(Employee[] employees, String name) {
        for (Employee e : employees) {
            if (e.getName().equals(name)) {
                return e;
            }
        }
        return null;
    }

    public static Employee findEmployeeByString(Employee[] employees, String str) {
        for (Employee e : employees) {
            if (e.getName().contains(str)) {
                return e;
            }
        }
        return null;
    }

    public static double countSalary(Employee[] employees) {
        double salary = 0.0;
        for (Employee e : employees) {
            salary += e.getSalary();
        }
        return salary;
    }

    public static double getMinSalary(Employee[] employees) {
        double minSalary = Integer.MAX_VALUE;
        for (Employee e : employees) {
            if (e.getSalary()<minSalary){
                minSalary = e.getSalary();
            }
        }
        return minSalary;
    }

    public static double getMaxSalary(Employee[] employees) {
        double maxSalary = 0;
        for (Employee e : employees) {
            if (e.getSalary()>maxSalary){
                maxSalary = e.getSalary();
            }
        }
        return maxSalary;
    }

    public static int getMinSubardinates(Manager[] managers) {
        int minSub = Integer.MAX_VALUE;
        for (Manager m : managers) {
            if (m.getNumberOfSubardinates()<minSub){
                minSub = m.getNumberOfSubardinates();
            }
        }
        return minSub;
    }

    public static int getMaxSubardinates(Manager[] managers) {
        int maxSub = 0;
        for (Manager m : managers) {
            if (m.getNumberOfSubardinates()>maxSub){
                maxSub = m.getNumberOfSubardinates();
            }
        }
        return maxSub;
    }
    public static double getMaxPremium(Manager[] managers) {
        double maxPr = 0;
        for (Manager m : managers) {
            double delta = m.getSalary() - m.getBaseSalary();
            if (delta > maxPr){
                maxPr = delta;
            }
        }
        return maxPr;
    }

    public static double getMinPremium(Manager[] managers) {
        double minPr = Integer.MAX_VALUE;
        for (Manager m : managers) {
            double delta = m.getSalary() - m.getBaseSalary();
            if (delta < minPr){
                minPr = delta;
            }
        }
        return minPr;
    }


}

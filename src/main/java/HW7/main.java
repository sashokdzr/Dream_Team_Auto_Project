package HW7;

//Необходимо создать утилитарный класс со следующими методами:
//        поиск сотрудника в массиве по его имени
//        поиск сотрудника в массиве по вхождению указанной строки в его имени
//        подсчет зарплатного бюджета для всех сотрудников в массиве
//        поиск наименьшей зарплаты в массиве
//        поиск наибольшей зарплаты в массиве
//        поиск наименьшего количества подчиненных в массиве менеджеров
//        поиск наибольшего количества подчиненных в массиве менеджеров
//        поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
//        поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров


class main {
    public static void main(String[] args) {

    }

    public String findEmployeeByName(String name, Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (name.equals(employees[i].getName())) {
                return employees[i].getName();
            }
        }
        return "Not found";
    }

    public String findEmployeeBySubName(String subname, Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().contains(subname)) {
                return employees[i].getName();
            }
        }
        return "Not found";
    }

    public double countBudget(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    public double findMaxSalary(Employee[] employees) {
        double max = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
            }
        }
        return max;
    }

    public double findMinSalary(Employee[] employees) {
        double min = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
            }
        }
        return min;
    }

    public int findMinNumberOfSubardinates(Manager[] managers) {
        int min = managers[0].getNumberOfSubardinates();
        for (int i = 0; i < managers.length; i++) {
            if (managers[i].getNumberOfSubardinates() < min) {
                min = managers[i].getNumberOfSubardinates();
            }
        }
        return min;
    }
    public int findMaxNumberOfSubardinates(Manager[] managers) {
        int max = managers[0].getNumberOfSubardinates();
        for (int i = 0; i < managers.length; i++) {
            if (managers[i].getNumberOfSubardinates() > max) {
                max = managers[i].getNumberOfSubardinates();
            }
        }
        return max;
    }

    public double findMaxPrem(Manager[] managers){
        double max = 0;
        for (int i=0; i<managers.length; i++){
            double dif = managers[i].getSalary()-managers[i].getBaseSalary();
            if (max<dif){
                max = dif;
            }
        }
        return max;
    }

    public double findMinPrem(Manager[] managers){
        double min = 0;
        for (int i=0; i<managers.length; i++){
            double dif = managers[i].getSalary()-managers[i].getBaseSalary();
            if (min>dif){
                min = dif;
            }
        }
        return min;
    }

}

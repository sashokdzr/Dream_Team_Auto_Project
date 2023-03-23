package HW7;

//Необходимо создать класс Employee со следующими методами:
//        getBaseSalary - получить базовую ставку
//        set Base Salary
//        getName - получить имя
//        setName
//        getSalary - получить зарплату


import HW10.IEmployee;

class Employee implements IEmployee {
    private double baseSalary;
    private String name;


    public Employee(double baseSalary, String name) {
        this.baseSalary = baseSalary;
        this.name = name;
    }

    public double getSalary() {
        return baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }


    public String getName() {
        return name;
    }


}

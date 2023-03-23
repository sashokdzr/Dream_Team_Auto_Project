package HW7;

//Необходимо создать класс Worker где метод getSalary будет возвращать базовую ставку.

class Worker extends Employee {
    public Worker(double baseSalary, String name) {
        super(baseSalary, name);
    }

    @Override
    public final double getSalary() {
        return getBaseSalary();
    }
}

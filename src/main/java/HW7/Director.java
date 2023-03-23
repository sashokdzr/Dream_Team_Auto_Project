package HW7;

//Необходимо создать класс Director с теми же методами,
//        что и Manager, но метод getSalary должен возвращать результат по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9).
//        Если количество подчиненных 0, то результат как у обычного рабочего.

final class Director extends Manager{
    public Director(double baseSalary, String name, int numberOfSubardinates, int numberOfSubardinates1) {
        super(baseSalary, name, numberOfSubardinates);
        this.numberOfSubardinates = numberOfSubardinates1;
    }

    @Override
    public int getNumberOfSubardinates() {
        return numberOfSubardinates;
    }

    public static final double INDEX =9;
    private int numberOfSubardinates;
    @Override
    public double getSalary() {
        return getBaseSalary()*numberOfSubardinates/100*INDEX;
    }
}

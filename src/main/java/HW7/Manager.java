package HW7;

//Необходимо создать класс Manager в который нужно добавить следующие методы:
//        getNumberOfSubordinates - получить количество подчиненных
//        setNumberOfSubordinates
//
//        в классе, метод getSalary будет возвращать значение по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 3). Если количество подчиненных 0, то результат как у обычного рабочего.


import HW10.IMAnager;

class Manager extends Employee implements IMAnager {
    public Manager(double baseSalary, String name, int numberOfSubardinates) {
        super(baseSalary, name);
        this.numberOfSubardinates = numberOfSubardinates;
    }

    public int getNumberOfSubardinates() {
        return numberOfSubardinates;
    }

    public static final double INDEX =3;
    @Override
    public double getSalary() {
        if (numberOfSubardinates>0) {
            return getBaseSalary() * numberOfSubardinates / 100 * INDEX;
        }
        else return getBaseSalary();
    }

    private int numberOfSubardinates;

}

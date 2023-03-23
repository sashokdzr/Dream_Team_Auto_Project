package HW72;

//Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и количество подчиненных.
//        Все поля сделать приватными и для каждого поля добавить методы set и get.
//        Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
//        К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.


final class Manager extends BaseEmployee {
    private int numberOfSubardinates;

    public Manager(String name, int age, char gender, double salaryPerDay, int numberOfSubardinates) {
        super(name, age, gender, salaryPerDay);
    }

    public int getNumberOfSubardinates() {
        return numberOfSubardinates;
    }

    public void setNumberOfSubardinates(int numberOfSubardinates) {
        this.numberOfSubardinates = numberOfSubardinates;
    }

    @Override
    double getSalary(Monthimpl[] monthArray){
        double sum=0;
        for (int i=0; i< monthArray.length; i++){
            sum+= monthArray[i].workingDaysInMonth;
        }
        return sum * getSalaryPerDay() * (1+numberOfSubardinates*0.01);
    }

}

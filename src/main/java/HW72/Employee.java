package HW72;

//Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
//        Все поля сделать приватными и для каждого поля добавить методы set и get.
//        Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает зарплату за те
//        месяцы которые были переданы в качестве аргумента.

final class Employee extends BaseEmployee {


    public Employee(String name, int age, char gender, double salaryPerDay) {
        super(name, age, gender, salaryPerDay);
    }

    @Override
    double getSalary(Monthimpl[] monthArray){
        double sum=0;
        for (int i=0; i< monthArray.length; i++){
            sum+= monthArray[i].workingDaysInMonth;
        }
        return sum * getSalaryPerDay();
    }
}

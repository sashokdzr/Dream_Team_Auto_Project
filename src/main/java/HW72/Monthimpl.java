package HW72;

//Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
//        Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month).

import HW10.IMonth;

public class Monthimpl implements IMonth {

    String monthName;
    int daysInMonth;
    int workingDaysInMonth;

    public Monthimpl(String monthName, int daysInMonth, int workingDaysInMonth) {
        this.monthName = monthName;
        this.daysInMonth = daysInMonth;
        this.workingDaysInMonth = workingDaysInMonth;
    }

    public String getMonthName() {
        return monthName;
    }

    public int getDaysInMonth() {
        return daysInMonth;
    }

    public int getWorkingDaysInMonth() {
        return workingDaysInMonth;
    }
}

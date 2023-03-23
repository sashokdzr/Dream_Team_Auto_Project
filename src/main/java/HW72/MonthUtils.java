package HW72;

//Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
//        Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month).

class MonthUtils {
    Monthimpl[] months = {
            new Monthimpl("January", 30, 22),
            new Monthimpl("February", 28, 21),
            new Monthimpl("March", 31, 20),
            new Monthimpl("April", 30, 19),
            new Monthimpl("May", 31, 18),
            new Monthimpl("June", 30, 17),
            new Monthimpl("July", 31, 16),
            new Monthimpl("August", 31, 17),
            new Monthimpl("September", 30, 18),
            new Monthimpl("October", 30, 19),
            new Monthimpl("November", 31, 20),
            new Monthimpl("December", 31, 21)
    };
}

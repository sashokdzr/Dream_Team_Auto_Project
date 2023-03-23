package HW6;

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        /*
        Необходимо создать класс Person с полями: имя, возраст, пол.
        Класс должен иметь метод - getName, метод возвращает имя с префиксом “Mr. ”
         если пол указан как мужской и префикс “Mrs. ” если женский.
         */
        Person person = new Person("Tony", 23, 'M');
        System.out.println(person.getName(person.name));
        Person person1 = new Person("Anna", 24, 'W');
        System.out.println(person1.getName(person1.name));
        Person person2 = new Person("Ken", 27, 'E');
        System.out.println(person2.getName(person2.name));

        /*
        Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
        Класс должен иметь метод isSameName(Employee employee) который возвращает true,
        если у сотрудника у которого был вызван метод и сотрудника который был передан как параметр,
        одинаковое имя.
         */
        Employee employee = new Employee("Tom", 67, 'M', 1000000);
        Employee employee1 = new Employee("Tod", 45, 'M', 2000000);
        Employee employee2 = new Employee("Any", 23, 'W', 3000000);
        Employee employee3 = new Employee("Any", 23, 'W');
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name:");
        String name1 = scanner.next();
        employee.setName1(name1);
        System.out.println(employee.isSameName(employee1));

        /*
        Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray),
        метод должен возвращать сумму зарплат всех сотрудников из массива
         переданного в качестве аргумента вызова метода.
         */
        Salary salary = new Salary();
        Employee[] employees = {new Employee("Bob", 56, 'M', 50000), employee1, employee2, employee3};
        System.out.println("Sum of salaries = " + salary.getSum(employees));


    }


}

package HW6;

class Employee {
    public Employee(String name, int age, char gender, int salary) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public Employee(String name, int age, char gender) {
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    String name;
    int age;
    char gender;
    int salary;

    String name1;
    public boolean isSameName(Employee employee){
        if (employee.name.equals(name1)){
            return true;
        }
        else {
            return false;
        }
    }
    public void setName1(String name1){
        this.name1=name1;
    }




}

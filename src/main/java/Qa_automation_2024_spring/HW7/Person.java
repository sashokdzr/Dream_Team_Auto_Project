package Qa_automation_2024_spring.HW7;

public class Person {

    public Person(String name, int age, String gender) {
        this.gender = gender;
        this.name = name;
        this.age = age;
    }
    String name;
    int age;
    String gender;

    String getName(){
        if (gender.equals("M")){
            return "Mr. " + name;
        } else if (gender.equals("W")) {
            return "Mrs. " + name;
        }
        else{
            return "Unknown gender";
        }
    }
}

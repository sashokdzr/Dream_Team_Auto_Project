package HW6;

class Person {
    public Person(String name, int age, char gender) {
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    String name;
    int age;
    char gender;

    public String getName(String name){
        if (Character.toString(gender).equals("M")){
            return "Mr. " + name;
        }
        else if (Character.toString(gender).equals("W")){
            return "Mrs. " + name;
        }
        else {
            return "Gender is incorrect";
        }

    }

}

package Test;

public class Human {
    public static void main(String[] args) {
        Man man1 = new Man(10, "Rob");
        Man man2 = new Man(15, "Dart");

        System.out.printf("Name1 is %s. Age1 is %d \n", man1.getName(), man1.getAge());
        System.out.println(man2.getAge() + man2.getName() + man1.SCHOOL);
    }

}

class Man{
    public static String SCHOOL = "Gym";
    private int age;
    private String name;
    public Man(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName(){
        return  name;
    }
}

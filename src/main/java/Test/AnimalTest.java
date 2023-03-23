package Test;

class AnimalTest {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.name = "Barsik";
        cat.age = 12;
        cat.weight = 23;
        Animal dog = new Animal();
        Animal mouse = new Animal();

        Animal[] animals = {cat, dog, mouse};
        for (int i=0; i<animals.length; i++){
            System.out.println(animals[i]);
        }
        NotAnimal fish = new NotAnimal();
        fish.name = "Fish";
        fish.age = 12;
        fish.color = "Gold";
        fish.size = "little";
        fish.weight = 5;
        System.out.println(fish);
        System.out.println(fish.getIndex());

        Operations operation = new Operations();
        System.out.println(operation.replace(2,3));
        System.out.println(operation.plus(4,5));
        operation.print(operation.replace(3,5));

        Operations operation1 = new Operations();
        operation1.print("HEllo");

    }

}

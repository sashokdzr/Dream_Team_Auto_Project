package Test;

class NotAnimal extends Animal{
    public String color;

    @Override
    public String toString() {
        return
                "age=" + age +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'';
    }
}


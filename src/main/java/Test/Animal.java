package Test;

class Animal {
    public int age;
    public int weight;
    public String name;
    public String size;

    public double getIndex(){
        double index=0;
        index = weight * 1.0 /age;
        return index;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

}
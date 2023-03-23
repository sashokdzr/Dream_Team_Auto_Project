package Streams;

class Car {
    private final String model;
    private final String color;
    private final Classification classification;

    public Car(String model, String color, Classification classification) {
        this.model = model;
        this.color = color;
        this.classification = classification;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Classification getClassification() {
        return classification;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", classification=" + classification +
                '}';
    }

}

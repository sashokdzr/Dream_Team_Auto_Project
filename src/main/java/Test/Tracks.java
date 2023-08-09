package Test;

public class Tracks extends Cars {
    public Tracks (String color, double engine, int costs){
        color = this.getColor();
        engine = this.getEngine();
        costs = this.getCosts();
    }
    private int wheels;
    private int maxWeight;

    public int getWheels() {
        return wheels;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}

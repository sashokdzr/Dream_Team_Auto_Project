package Test;

public class StartCars {
    public static void main(String[] args) {
        Tracks track1 = new Tracks("Red", 3.0, 30000);
        track1.setMaxWeight(2000);
        track1.setWheels(6);
        Cars track2 = new Tracks("Yellow", 2.5, 50000);
    }
}

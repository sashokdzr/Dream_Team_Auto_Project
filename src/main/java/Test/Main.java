package Test;

public class Main {
    public static void main(String[] args) {
        Bulb bulb1 = new Bulb();
        Switch switch1 = new Switch(bulb1);
        switch1.turnOn();
        switch1.turnOff();
    }
}

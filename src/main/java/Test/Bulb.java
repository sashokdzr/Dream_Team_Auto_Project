package Test;

public class Bulb implements Switchable{

    @Override
    public void switchOn() {
        System.out.println("Bulb is ON");
    }

    @Override
    public void switchOff() {
        System.out.println("Bulb is Off");
    }
}

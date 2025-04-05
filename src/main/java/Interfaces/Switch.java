package Interfaces;

public class Switch {
    private final Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void turnOn(){
        device.switchOn();
    }

    public void turnOff(){
        device.switchOff();
    }

}
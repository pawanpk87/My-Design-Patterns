package BridgeCode;

public class Radio implements Device {

    private int volume = 10;

    public void turnOn() {
        System.out.println("Radion is turned ON");
    }

    public void turnOff() {
        System.out.println("Radion is turned OFF");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Radion volume set to: " + volume);
    }
}
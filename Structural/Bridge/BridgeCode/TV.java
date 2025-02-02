package BridgeCode;

public class TV implements Device {
    private int volume = 10;

    public void turnOn() {
        System.out.println("TV is turned ON");
    }

    public void turnOff() {
        System.out.println("TV is turned OFF");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV volume set to: " + volume);
    }
}
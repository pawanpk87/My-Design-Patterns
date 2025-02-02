package BridgeCode;

public class Client {
    public static void main(String[] args) {
        Device TV = new TV();

        RemoteControl basiControl = new BasicRemote(TV);
        basiControl.turnOn();
        basiControl.turnOff();

        Device radio = new Radio();
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);
        advancedRemote.turnOn();
        advancedRemote.setVolume(15);
        advancedRemote.turnOff();
    }
}
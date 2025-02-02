package BridgeCode;

public class AdvancedRemote extends RemoteControl {

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void setVolume(int volume) {
        device.setVolume(volume);
    }
}
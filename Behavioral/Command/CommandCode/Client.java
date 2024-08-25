package CommandCode;

public class Client {
    public static void main(String[] args) {
        // -------------------- Simple Remote Control --------------------------
        // Receiver
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        // Command
        Command lightOnCommand = new LightOnCommand(light);
        Command garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        // Requester
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();

        simpleRemoteControl.setCommand(garageDoorOpenCommand);
        simpleRemoteControl.buttonWasPressed();

        // -------------------- Remote Control --------------------------

    }
}

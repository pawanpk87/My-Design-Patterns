package BridgeCode;

public class ImageMessage extends Message {
    public ImageMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    void send(String message) {
        messageSender.sendMessage(message);
    }
}
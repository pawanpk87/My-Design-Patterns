package BridgeCode;

public class TextMessage extends Message {
    public TextMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    void send(String message) {
        messageSender.sendMessage(message);
    }
}
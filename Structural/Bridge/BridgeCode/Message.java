package BridgeCode;

public abstract class Message {
    protected MessageSender messageSender;

    public Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    abstract void send(String message);
}

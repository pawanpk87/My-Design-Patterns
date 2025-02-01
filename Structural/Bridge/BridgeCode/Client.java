package BridgeCode;

public class Client {
    public static void main(String[] args) {
        Message textMessage = new TextMessage(new EmailSender());
        Message imageMessage = new ImageMessage(new SMSSender());

        textMessage.send("Text message");
        imageMessage.send("Image message");
    }
}
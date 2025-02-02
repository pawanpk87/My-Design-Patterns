package MediatorCode;

public class ChatUser extends User {

    public ChatUser(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    public void sendMessage(String message) {
        System.out.println(name + " sends: " + message);
        chatMediator.sendMessage(message, this);
    }

    public void receiveMessage(String message) {
        System.out.println(name + " received: " + message);
    }
}
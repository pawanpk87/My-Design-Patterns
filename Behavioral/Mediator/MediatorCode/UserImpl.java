package MediatorCode;

public class UserImpl implements ChatUser {
    private String name;
    private ChatMediator mediator;

    public UserImpl(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " received message: " + message);
    }
}
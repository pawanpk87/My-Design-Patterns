package MediatorCode;

public interface ChatMediator {
    void sendMessage(String message, ChatUser chatUser);

    void addUser(ChatUser user);

    void removeUser(ChatUser user);
}

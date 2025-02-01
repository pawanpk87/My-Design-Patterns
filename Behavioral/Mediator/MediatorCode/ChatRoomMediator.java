package MediatorCode;

import java.util.ArrayList;
import java.util.List;

public class ChatRoomMediator implements ChatMediator {
    private List<ChatUser> users;

    public ChatRoomMediator() {
        users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, ChatUser chatUser) {
        for (ChatUser user : users) {
            if (user != chatUser) {
                chatUser.receiveMessage(message);
            }
        }
    }

    @Override
    public void addUser(ChatUser user) {
        users.add(user);
    }

    @Override
    public void removeUser(ChatUser user) {
        users.remove(user);
    }
}
package MediatorCode;

public class Client {
    public static void main(String[] args) {
        ChatRoomMediator chatRoomMediator = new ChatRoomMediator();

        ChatUser user1 = new UserImpl("User1", chatRoomMediator);
        ChatUser user2 = new UserImpl("User2", chatRoomMediator);
        ChatUser user3 = new UserImpl("User3", chatRoomMediator);

        chatRoomMediator.addUser(user1);
        chatRoomMediator.addUser(user2);
        chatRoomMediator.addUser(user3);

        user1.sendMessage("Hello everyone!");
    }
}
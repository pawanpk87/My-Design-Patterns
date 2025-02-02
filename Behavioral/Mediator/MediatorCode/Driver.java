package MediatorCode;

public class Driver {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User user1 = new ChatUser(chatRoom, "user1");
        User user2 = new ChatUser(chatRoom, "user2");
        User user3 = new ChatUser(chatRoom, "user3");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.sendMessage("hii");
    }
}
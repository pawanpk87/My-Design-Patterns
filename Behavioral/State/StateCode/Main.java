package StateCode;

public class Main {
    public static void main(String[] args) {
        User user = new User("admin");

        Document document = new Document(new DraftState());

        document.publish(user);
        document.publish(user);
        document.publish(user);
    }
}
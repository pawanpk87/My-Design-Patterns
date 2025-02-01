package StateCode;

public class ModerationState implements State {
    @Override
    public void publish(Document document, User currUser) {
        if (currUser.isAdmin()) {
            System.out.println("User is an admin, publishing the document");
            document.setState(new PublishedState());
        } else {
            System.out.println("User is not an admin, cannot publish the document");
        }
    }
}
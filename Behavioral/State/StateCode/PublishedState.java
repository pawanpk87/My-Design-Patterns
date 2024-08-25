package StateCode;

public class PublishedState implements State {
    @Override
    public void publish(Document document, User currentUser) {
        System.out.println("Document is already published");
    }
}
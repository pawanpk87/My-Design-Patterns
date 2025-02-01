package StateCode;

public class DraftState implements State {
    @Override
    public void publish(Document document, User user) {
        System.out.println("Document is in Draft state, moving to Moderation");
        document.setState(new ModerationState());
    }
}
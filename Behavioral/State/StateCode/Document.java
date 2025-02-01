package StateCode;

public class Document {
    private State state;

    public Document(State state) {
        setState(state);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void publish(User currentUser) {
        state.publish(this, currentUser);
    }
}

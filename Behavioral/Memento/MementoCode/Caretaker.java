import java.util.Stack;

public class Caretaker {
    private final Stack<Memento> history;

    public Caretaker() {
        this.history = new Stack<>();
    }

    public void save(Memento memento) {
        history.push(memento);
    }

    public Memento undo() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
}
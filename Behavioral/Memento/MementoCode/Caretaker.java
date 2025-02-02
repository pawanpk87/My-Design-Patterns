package MementoCode;

import java.util.Stack;

public class Caretaker {
    private final Stack<Memento> history;

    public Caretaker() {
        history = new Stack<>();
    }

    public void save(Memento memento) {
        this.history.push(memento);
    }

    public Memento undo() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
}
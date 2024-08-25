package MementoCode;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("state1");
        caretaker.saveMemento(originator.saveStateToMemento());

        originator.setState("state2");

        originator.getStateFromMemento(caretaker.getMemento());

        System.out.println("Current State: " + originator.getState());
    }
}
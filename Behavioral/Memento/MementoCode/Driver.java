package MementoCode;

public class Driver {
    public static void main(String[] args) {

        Editor editor = new Editor();
        Caretaker caretaker = new Caretaker();

        editor.type("Pawan");
        editor.type(" Mehta");

        caretaker.save(editor.save());

        System.out.println("Editor state: " + editor.getContent());

        editor.type(" Kumar!");

        System.out.println("Editor state: " + editor.getContent());

        editor.restore(caretaker.undo());

        System.out.println("Editor state: " + editor.getContent());
    }
}
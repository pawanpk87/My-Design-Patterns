public class Client {
    public static void main(String[] args) {
        /*
         * Editor editor = new Editor();
         * 
         * editor.type("Pawan Mehta");
         * 
         * Memento savedMemento = editor.save();
         * 
         * System.out.println("Editor state: " + editor.getContent());
         * editor.type(" Kumar!");
         * System.out.println("Editor state: " + editor.getContent());
         * editor.restore(savedMemento);
         * System.out.println("Editor state: " + editor.getContent());
         */

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
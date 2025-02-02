package MementoCode;

public class TextEditor {
    private String content;

    public TextEditor() {
        this.content = "";
    }

    public void type(String words) {
        this.content += words;
    }

    public String getContent() {
        return this.content;
    }

    public Memento save() {
        return new Memento(this.content);
    }

    public void restore(Memento memento) {
        this.content = memento.getState();
    }
}
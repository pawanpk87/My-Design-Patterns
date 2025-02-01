public class Editor {
    private String content;

    public Editor() {
        this.content = "";
    }

    public void type(String words) {
        this.content += words;
    }

    public String getContent() {
        return this.content;
    }

    public Memento save() {
        return new Memento(content);
    }

    public void restore(Memento memento) {
        this.content = memento.getState();
    }
}
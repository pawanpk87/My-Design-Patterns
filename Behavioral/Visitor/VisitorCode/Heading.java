package VisitorCode;

public class Heading implements Element {
    private String text;

    public Heading(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitHeading(this);
    }
}
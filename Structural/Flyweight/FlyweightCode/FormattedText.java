package FlyweightCode;

public class FormattedText {
    private final String text;
    private final FormattingContext formattingContext;

    public FormattedText(String text, FormattingContext formattingContext) {
        this.text = text;
        this.formattingContext = formattingContext;
    }

    public void print() {
        System.out.println("Printed the text on formattingContext format");
    }
}

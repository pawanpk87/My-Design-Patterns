package FlyweightCode;

public class FormattingContext {
    private final String font;
    private final int size;
    private final String color;

    public FormattingContext(String font, int size, String color){
        this.font = font;
        this.size = size;
        this.color = color;
    }
}


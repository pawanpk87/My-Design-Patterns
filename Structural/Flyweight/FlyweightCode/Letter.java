package FlyweightCode;

public class Letter implements TextCharacter {

    private final char character;

    public Letter(char character) {
        this.character = character;
    }

    public void display(int fontSize) {
        System.out.println("Character: " + character + " with font size: " + fontSize);
    }
}
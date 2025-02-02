package FlyweightCode;

public class Client {
    public static void main(String[] args) {
        String doc = "Pawan Mehta";

        for (char ch : doc.toCharArray()) {
            TextCharacter letter = CharacterFactory.getLetter(ch);
            letter.display(18);
        }
    }
}
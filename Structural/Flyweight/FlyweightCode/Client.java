package FlyweightCode;

public class Client {
    public static void main(String[] args) {
        FormattedText boldRedText = FormattedFactory.getFormattedText("text", "font", 2, "green");
        boldRedText.print();
    }
}

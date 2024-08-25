package ChainOfResponsibilityCode;

public class Client {
    public static void main(String[] args) {
        SupportHandler lowHandler = new LowSupportHandler();
        SupportHandler mediumHandler = new MediumSupportHandler();

        //lowHandler.setNextHandler(mediumHandler);

        Request request1 = new Request("Issue with login", Severity.LOW);
        Request request2 = new Request("Slow performance", Severity.MEDIUM);

        lowHandler.handleRequest(request1);
        lowHandler.handleRequest(request2);
    }
}

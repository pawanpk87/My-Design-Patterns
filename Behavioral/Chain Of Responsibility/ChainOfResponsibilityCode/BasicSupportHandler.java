package ChainOfResponsibilityCode;

public class BasicSupportHandler extends SupportHandler {

    public void handleRequest(String requestType) {
        if (requestType.equals("General Inquiry")) {
            System.out.println("Basic Support: Handling general inquiry.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(requestType);
        } else {
            System.out.println("Can not handle request");
        }
    }
}
package ChainOfResponsibilityCode;

public class TechnicalSupportHandler extends SupportHandler {

    public void handleRequest(String requestType) {
        if (requestType.equals("Technical Issue")) {
            System.out.println("Technical Support: Handling technical issue.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(requestType);
        } else {
            System.out.println("Can not handle request");
        }
    }
}
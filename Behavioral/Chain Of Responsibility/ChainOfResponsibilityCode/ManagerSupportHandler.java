package ChainOfResponsibilityCode;

public class ManagerSupportHandler extends SupportHandler {
    
    public void handleRequest(String requestType) {
        if (requestType.equals("Serious Complaint")) {
            System.out.println("Manager Support: Handling serious complaint.");
        } else {
            System.out.println("No handler available for: " + requestType);
        }
    }
}
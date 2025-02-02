package ChainOfResponsibilityCode;

public class Driver {
    public static void main(String[] args) {
        BasicSupportHandler basicSupportHandler = new BasicSupportHandler();
        TechnicalSupportHandler technicalSupportHandler = new TechnicalSupportHandler();
        ManagerSupportHandler managerSupportHandler = new ManagerSupportHandler();

        basicSupportHandler.setNextHandler(technicalSupportHandler);
        technicalSupportHandler.setNextHandler(managerSupportHandler);

        basicSupportHandler.handleRequest("General Inquiry");
        basicSupportHandler.handleRequest("Technical Issue");
        basicSupportHandler.handleRequest("Serious Complaint");
    }
}

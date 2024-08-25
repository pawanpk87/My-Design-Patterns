package ChainOfResponsibilityCode;

public class Request {
    private String description;
    private Severity severity;

    public Request(String description, Severity severity) {
        this.description = description;
        this.severity = severity;
    }

    public String getDescription() {
        return description;
    }

    public Severity getSeverity() {
        return severity;
    }
}
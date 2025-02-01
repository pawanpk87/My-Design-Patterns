package CommandCode;

public class NoCommand implements Command {
    public void execute() {
        System.out.println("No command to execute!");
    }
}

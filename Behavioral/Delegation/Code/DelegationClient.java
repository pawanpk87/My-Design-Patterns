interface Printer {
    void print(final String message);
}

class HPPrinter implements Printer {
    @Override
    public void print(final String message) {
        System.out.println("HP Printer: " + message);
    }
}

class CanaonPrinter implements Printer {
    @Override
    public void print(final String message) {
        System.out.println("Canaon Printer: " + message);
    }
}

class EpsonPrinter implements Printer {
    @Override
    public void print(final String message) {
        System.out.println("Epson Printer: " + message);
    }
}

class PrinterController implements Printer {
    private final Printer printer;

    public PrinterController(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(final String message) {
        printer.print(message);
    }
}

public class DelegationClient {
    public static void main(String[] args) {
        var hpPrinterController = new PrinterController(new HPPrinter());
        var canonPrinterController = new PrinterController(new CanaonPrinter());
        var epsonPrinterController = new PrinterController(new EpsonPrinter());

        hpPrinterController.print("Pawan Kumar Mehta");
        canonPrinterController.print("Pawan Kumar Mehta");
        epsonPrinterController.print("Pawan Kumar Mehta");
    }
}
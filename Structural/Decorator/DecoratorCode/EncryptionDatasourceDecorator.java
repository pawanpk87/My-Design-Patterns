package DecoratorCode;

public class EncryptionDatasourceDecorator extends DatasourceDecorator {

    public EncryptionDatasourceDecorator(Datasource datasource) {
        super(datasource);
    }

    public void writeData(String data) {
        System.out.println("(EncryptionDecorator) Writing data to file...");
        super.writeData(encode(data));
    }

    public String readData() {
        System.out.println("(EncryptionDecorator) Reading data from file...");
        return decode(super.readData());
    }

    private String encode(String data) {
        return "encoded Data";
    }

    private String decode(String data) {
        return "decoded Data";
    }
}
public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(Datasource datasource) {
        super(datasource);
    }

    @Override
    public void writeData(String data) {
        // write data to file logic
        System.out.println("(EncryptionDecorator) Writing data to file...");
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        // read data from file logic
        System.out.println("(EncryptionDecorator) Reading data from file...");
        return decode(super.readData());
    }

    private String encode(String data) {
        // ecode
        System.out.println("Encrypting data...");
        return null;
    }

    private String decode(String data) {
        // decode
        System.out.println("Decrypting data...");
        return null;
    }
}

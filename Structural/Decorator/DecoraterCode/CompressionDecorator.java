public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(Datasource datasource) {
        super(datasource);
    }

    @Override
    public void writeData(String data) {
        // write data to file logic
        System.out.println("(CompressionDecorator) Writing data to file...");
        super.writeData(compress(data));
    }

    @Override
    public String readData() {
        // read data from file logic
        System.out.println("(CompressionDecorator) Reading data from file...");
        return decompress(super.readData());
    }

    private String compress(String stringData) {
        // compress
        System.out.println("Compressing the data...");
        return null;
    }

    private String decompress(String stringData) {
        // decompress
        System.out.println("Decompressing the data...");
        return null;
    }
}
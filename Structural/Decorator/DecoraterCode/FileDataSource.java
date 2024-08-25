public class FileDataSource implements Datasource {
    private String fileName;

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void writeData(String data) {
        // write data to file
        System.out.println("(FileDataSource) Writing data to file...");
    }

    @Override
    public String readData() {
        // read data from file
        System.out.println("(FileDataSource) Reading data from file...");
        return "data";
    }
}

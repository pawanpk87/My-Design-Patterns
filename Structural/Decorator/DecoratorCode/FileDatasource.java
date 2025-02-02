package DecoratorCode;

public class FileDatasource implements Datasource {

    public void writeData(String data) {
        System.out.println("(FileDataSource) Writing data to file...");
    }

    public String readData() {
        System.out.println("(FileDataSource) Reading data from file...");
        return "data";
    }
}
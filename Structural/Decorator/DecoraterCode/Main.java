public class Main {
    public static void main(String[] args) {
        String fileData = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        DataSourceDecorator dataSourceDecorator = new CompressionDecorator(
                new EncryptionDecorator(new FileDataSource("out/OutputDemo.txt")));

        dataSourceDecorator.writeData(fileData);
        dataSourceDecorator.readData();
    }
}

package DecoratorCode;

public class Driver {
    public static void main(String[] args) {
        Datasource fileDatasource = new FileDatasource();

        DatasourceDecorator datasourceDecorator = new EncryptionDatasourceDecorator(fileDatasource);

        datasourceDecorator.writeData("data");
        System.out.println(datasourceDecorator.readData());
    }
}
package DecoratorCode;

public abstract class DatasourceDecorator implements Datasource {

    private Datasource wrapper;

    public DatasourceDecorator(Datasource wrapper) {
        this.wrapper = wrapper;
    }

    public void writeData(String data) {
        wrapper.writeData(data);
    }

    public String readData() {
        return wrapper.readData();
    }
}
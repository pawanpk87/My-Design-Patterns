public abstract class DataSourceDecorator implements Datasource {
    private Datasource wrapper;

    DataSourceDecorator(Datasource source) {
        this.wrapper = source;
    }

    @Override
    public void writeData(String data) {
        wrapper.writeData(data);
    }

    @Override
    public String readData() {
        return wrapper.readData();
    }
}

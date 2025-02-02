package AdapterCode;

public class JSONStockDataProvider implements StockDataProvider {
    XMLStockDataProvider xmlStockDataProvider;

    public JSONStockDataProvider(XMLStockDataProvider xmlStockDataProvider) {
        this.xmlStockDataProvider = xmlStockDataProvider;
    }

    public String getData() {
        String xmlData = xmlStockDataProvider.getData();
        String jsonData = convertXmlToJSON(xmlData);
        return jsonData;
    }

    private String convertXmlToJSON(String xmlData) {
        return "json Data";
    }
}
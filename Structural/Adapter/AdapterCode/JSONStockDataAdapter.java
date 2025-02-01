package AdapterCode;

public class JSONStockDataAdapter implements StockData {
    XMLStockDataProvider xmlStockDataProvider;

    public JSONStockDataAdapter(XMLStockDataProvider xmlStockDataProvider) {
        this.xmlStockDataProvider = xmlStockDataProvider;
    }

    @Override
    public String getStockData() {
        String xmlData = xmlStockDataProvider.getStockData();
        String jsonData = convertXmlToJSON(xmlData);
        return jsonData;
    }

    private String convertXmlToJSON(String xmlData) {
        return "xmlData into JSON format";
    }
}

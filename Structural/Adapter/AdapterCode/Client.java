package AdapterCode;

public class Client {
    public static void main(String[] args) {
        XMLStockDataProvider xmlStockDataProvider = new XMLStockDataProvider();

        StockData jsonAdapter = new JSONStockDataAdapter(xmlStockDataProvider);

        AnalyticsLibrary analyticsLibrary = new AnalyticsLibrary();

        analyticsLibrary.analyzeJSONData(jsonAdapter.getStockData());
    }
}

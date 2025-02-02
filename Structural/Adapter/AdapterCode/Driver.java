package AdapterCode;

public class Driver {
    public static void main(String[] args) {
        XMLStockDataProvider xmlStockDataProvider = new XMLStockDataProvider();

        JSONStockDataProvider jsonStockDataProvider = new JSONStockDataProvider(xmlStockDataProvider);

        AnalyticsEngine analyticsEngine = new AnalyticsEngine();

        analyticsEngine.analyzeJSONData(jsonStockDataProvider.getData());
    }
}
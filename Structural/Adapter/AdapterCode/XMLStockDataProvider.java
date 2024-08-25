package AdapterCode;

public class XMLStockDataProvider implements StockData {
    @Override
    public String getStockData() {
        // download the stock data in XML
        return "data";
    }
}

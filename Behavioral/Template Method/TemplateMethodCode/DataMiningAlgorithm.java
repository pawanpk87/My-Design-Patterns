package TemplateMethodCode;

public abstract class DataMiningAlgorithm {
    public final void mineData(String filePath){
        openFilePath(filePath);
        extractData();
        analyzeData();
        sendReport();
        closeFile();
    }

    // Concrete method with a default implementation
    void analyzeData() {
        System.out.println("Default implementation: Analyzing data...");
        // Default implementation for analyzing data
    }

    // Concrete method with a default implementation
    void sendReport() {
        System.out.println("Default implementation: Sending report...");
        // Default implementation for sending report
    }

    abstract void openFilePath(String filePath);
    abstract void extractData();
    abstract void closeFile();
}
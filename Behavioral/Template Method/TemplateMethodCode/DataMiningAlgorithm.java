package TemplateMethodCode;

public abstract class DataMiningAlgorithm {

    public final void mineData(String filePath) {
        openFile(filePath);
        extractData();
        analyzeData();
        sendReport();
        closeFile();
    }

    void analyzeData() {
        System.out.println("Default implementation: Analyzing data...");
    }

    void sendReport() {
        System.out.println("Default implementation: Sending report...");
    }

    abstract void openFile(String filePath);

    abstract void extractData();

    abstract void closeFile();
}
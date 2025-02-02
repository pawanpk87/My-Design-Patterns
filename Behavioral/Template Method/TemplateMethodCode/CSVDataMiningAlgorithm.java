package TemplateMethodCode;

public class CSVDataMiningAlgorithm extends DataMiningAlgorithm {

    void openFile(String filePath) {
        System.out.println("Opening CSV file: " + filePath);
    }

    @Override
    void extractData() {
        System.out.println("Extracting data from CSV file...");
    }

    @Override
    void closeFile() {
        System.out.println("Closing CSV file");
    }
}
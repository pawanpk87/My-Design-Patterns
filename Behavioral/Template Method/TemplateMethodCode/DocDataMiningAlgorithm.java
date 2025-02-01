package TemplateMethodCode;

public class DocDataMiningAlgorithm extends DataMiningAlgorithm {
    @Override
    void openFilePath(String filePath) {
        System.out.println("Opening DOC file: " + filePath);
        // Implement opening DOC file
    }

    @Override
    void extractData() {
        System.out.println("Extracting data from DOC file...");
        // Implement extracting data from DOC file
    }

    @Override
    void sendReport() {
        System.out.println("Sending data from DOC file...");
        // Implement extracting data from DOC file
    }

    @Override
    void closeFile() {
        System.out.println("Closing DOC file");
        // Implement closing DOC file
    }
}
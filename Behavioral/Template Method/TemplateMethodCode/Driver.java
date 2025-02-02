package TemplateMethodCode;

public class Driver {
    public static void main(String[] args) {
        DataMiningAlgorithm docDataMiningAlgorithm = new DocDataMiningAlgorithm();
        docDataMiningAlgorithm.mineData("filePath");
    }
}
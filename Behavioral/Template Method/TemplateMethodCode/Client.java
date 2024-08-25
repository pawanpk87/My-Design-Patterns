package TemplateMethodCode;

public class Client {
    public static void main(String[] args) {
        DataMiningAlgorithm docDataMiningAlgorithm = new DocDataMiningAlgorithm();
        docDataMiningAlgorithm.mineData("file Path");
    }
}
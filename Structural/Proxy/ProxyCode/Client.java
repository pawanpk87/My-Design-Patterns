package ProxyCode;

public class Client {
    public static void main(String[] args) {
        ProxyDownloader proxyDownloader = new ProxyDownloader();
        proxyDownloader.downloadFile("file1.txt");
    }
}

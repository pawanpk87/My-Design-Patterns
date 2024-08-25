package ProxyCode;

public class RealDownloader implements Downloader {
    @Override
    public void downloadFile(String file) {
        System.out.println("Downloading file: " + file + " from remote server...");
    }
}

package ProxyCode;

import java.util.HashMap;
import java.util.Map;

public class ProxyDownloader implements Downloader {
    private RealDownloader realDownloader;
    private Map<String, String> cachedFiles;

    public ProxyDownloader() {
        this.realDownloader = new RealDownloader();
        this.cachedFiles = new HashMap<>();
    }

    @Override
    public void downloadFile(String file) {
        if (cachedFiles.containsKey(file)) {
            System.out.println("File " + file + " is already cached locally. Retrieving from cache...");
        } else {
            realDownloader.downloadFile(file);
            cachedFiles.put(file, file);
        }
    }
}

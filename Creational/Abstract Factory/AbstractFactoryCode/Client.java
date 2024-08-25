package AbstractFactoryCode;

import AbstractFactoryCode.factory.GUIFactory;
import AbstractFactoryCode.factory.MacOsFactory;
import AbstractFactoryCode.factory.WindowFactory;

public class Client {
    public static void main(String[] args) {
        Application application;
        GUIFactory guiFactory;
        String osName = "MAC";

        if ("MAC".equals(osName)) {
            guiFactory = new MacOsFactory();
        } else {
            guiFactory = new WindowFactory();
        }

        application = new Application(guiFactory);
        application.paint();
    }
}

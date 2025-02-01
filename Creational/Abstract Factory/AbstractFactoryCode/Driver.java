package AbstractFactoryCode;

import AbstractFactoryCode.factory.GUIFactory;
import AbstractFactoryCode.factory.MacOsGUIFactory;
import AbstractFactoryCode.factory.WindowGUIFactory;

public class Driver {

    public static void main(String[] args) {
        Application application = null;
        GUIFactory guiFactory = null;

        String osName = "MAC";

        if (osName.equals("MAC")) {
            guiFactory = new MacOsGUIFactory();
        } else {
            guiFactory = new WindowGUIFactory();
        }

        application = new Application(guiFactory);

        application.paint();
    }
}
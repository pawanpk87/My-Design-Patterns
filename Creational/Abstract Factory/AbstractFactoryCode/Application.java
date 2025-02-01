package AbstractFactoryCode;

import AbstractFactoryCode.factory.GUIFactory;
import AbstractFactoryCode.model.button.Button;
import AbstractFactoryCode.model.checkboxes.CheckBox;

public class Application {

    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory guiFactory) {
        this.button = guiFactory.createButton();
        this.checkBox = guiFactory.creatCheckBox();
    }

    public void paint() {
        this.button.paint();
        this.checkBox.paint();
    }
}
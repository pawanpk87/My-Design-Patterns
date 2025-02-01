package AbstractFactoryCode.factory;

import AbstractFactoryCode.model.button.Button;
import AbstractFactoryCode.model.button.WindowOsButton;
import AbstractFactoryCode.model.checkboxes.CheckBox;
import AbstractFactoryCode.model.checkboxes.WindowOsCheckBox;

public class WindowGUIFactory implements GUIFactory {

    public Button createButton() {
        return new WindowOsButton();
    }

    public CheckBox creatCheckBox() {
        return new WindowOsCheckBox();
    }
}
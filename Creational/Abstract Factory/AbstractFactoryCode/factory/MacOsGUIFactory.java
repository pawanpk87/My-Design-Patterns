package AbstractFactoryCode.factory;

import AbstractFactoryCode.model.button.Button;
import AbstractFactoryCode.model.button.MocOSButton;
import AbstractFactoryCode.model.checkboxes.CheckBox;
import AbstractFactoryCode.model.checkboxes.MocOsCheckBox;

public class MacOsGUIFactory implements GUIFactory {

    public Button createButton() {
        return new MocOSButton();
    }

    public CheckBox creatCheckBox() {
        return new MocOsCheckBox();
    }
}
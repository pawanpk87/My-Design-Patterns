package AbstractFactoryCode.factory;

import AbstractFactoryCode.model.button.Button;
import AbstractFactoryCode.model.checkboxes.CheckBox;

public interface GUIFactory {

    Button createButton();

    CheckBox creatCheckBox();
}
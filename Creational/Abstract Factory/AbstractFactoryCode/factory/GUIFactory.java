package AbstractFactoryCode.factory;

import AbstractFactoryCode.buttonsobj.Button;
import AbstractFactoryCode.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}

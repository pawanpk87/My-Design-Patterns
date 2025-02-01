package AbstractFactoryCode.factory;

import AbstractFactoryCode.buttonsobj.Button;
import AbstractFactoryCode.buttonsobj.MacOsButton;
import AbstractFactoryCode.checkboxes.Checkbox;
import AbstractFactoryCode.checkboxes.MacOsCheckbox;

public class MacOsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }
}

package AbstractFactoryCode.factory;

import AbstractFactoryCode.buttonsobj.Button;
import AbstractFactoryCode.buttonsobj.WindowButton;
import AbstractFactoryCode.checkboxes.Checkbox;
import AbstractFactoryCode.checkboxes.WindowCheckbox;

public class WindowFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowCheckbox();
    }
}

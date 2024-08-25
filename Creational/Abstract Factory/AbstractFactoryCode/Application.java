package AbstractFactoryCode;

import AbstractFactoryCode.buttonsobj.Button;
import AbstractFactoryCode.checkboxes.Checkbox;
import AbstractFactoryCode.factory.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}

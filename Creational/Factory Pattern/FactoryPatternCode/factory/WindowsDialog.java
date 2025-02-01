package FactoryPatternCode.factory;

import FactoryPatternCode.buttonsobj.*;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
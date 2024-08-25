package FactoryPatternCode.factory;

import FactoryPatternCode.buttonsobj.*;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
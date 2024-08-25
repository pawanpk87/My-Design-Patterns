package FactoryPatternCode.factory;

import FactoryPatternCode.buttonsobj.*;

public abstract class Dialog {
    public void renderWindow() {
        // render the window
        Button btn = createButton();
        btn.render();
    }

    public abstract Button createButton();
}
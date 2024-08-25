package FactoryPatternCode;

import FactoryPatternCode.buttonsobj.*;
import FactoryPatternCode.factory.*;

public class Client {
    public static void main(String[] args) {
        Dialog window = new WindowsDialog();
        Dialog html = new HtmlDialog();

        Button windowBtn = window.createButton();
        Button htmlBtn = html.createButton();

        windowBtn.onClick();
        htmlBtn.onClick();
    }
}
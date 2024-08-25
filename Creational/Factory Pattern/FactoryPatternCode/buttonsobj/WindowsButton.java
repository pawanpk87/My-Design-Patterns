package FactoryPatternCode.buttonsobj;

public class WindowsButton implements Button {
    public void render() {
        System.out.println("WindowsButton rendered");
    }

    public void onClick() {
        System.out.println("WindowsButton clicked");
    }
}
package FactoryPatternCode.buttonsobj;

public class HtmlButton implements Button {
    public void render() {
        System.out.println("HtmlButton rendered");
    }

    public void onClick() {
        System.out.println("HtmlButton clicked");
    }
}
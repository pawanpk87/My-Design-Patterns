package AbstractFactoryCode.buttonsobj;

public class MacOsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOsButton");
    }
}

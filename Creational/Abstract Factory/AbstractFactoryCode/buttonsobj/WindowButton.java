package AbstractFactoryCode.buttonsobj;

public class WindowButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowButton");
    }
}

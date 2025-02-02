package CompositeCode;

public class MenuItem extends MenuComponent {
    private String name;
    private String descripton;
    private boolean isVegetarian;
    private double price;

    public MenuItem(String name, String descripton, boolean isVegetarian, double price) {
        this.name = name;
        this.descripton = descripton;
        this.isVegetarian = isVegetarian;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.descripton;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean isVegetarian() {
        return this.isVegetarian;
    }

    public void print() {
        System.out.println(" " + getName());
        if (isVegetarian()) {
            System.out.println("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("  -- " + getDescription());
    }
}
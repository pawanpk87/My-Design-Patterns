package CompositeCode;

import java.util.*;

public class Menu extends MenuComponent {
    private String name;
    private String descripton;
    private List<MenuComponent> menuComponents = new ArrayList<>();

    public Menu(String name, String descripton) {
        this.name = name;
        this.descripton = descripton;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int child) {
        return menuComponents.get(child);
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.descripton;
    }

    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");
        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}
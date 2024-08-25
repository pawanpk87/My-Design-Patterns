package ObserverCode;

import java.util.ArrayList;

public class WetherSubject implements Subject {
    private WetherData wetherData;
    private ArrayList<Observer> observers;

    public WetherSubject() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index != -1) {
            observers.remove(observer);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(wetherData);
        }
    }

    public void wetherDataChanged() {
        notifyObservers();
    }

    public WetherData getWetherData() {
        return wetherData;
    }

    public void setWetherData(WetherData wetherData) {
        this.wetherData = wetherData;
        wetherDataChanged();
    }
}
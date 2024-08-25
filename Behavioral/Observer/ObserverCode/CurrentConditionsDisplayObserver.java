package ObserverCode;

public class CurrentConditionsDisplayObserver implements Observer {
    private WetherSubject wetherSubject;

    public CurrentConditionsDisplayObserver(WetherSubject wetherSubject) {
        this.wetherSubject = wetherSubject;
        wetherSubject.registerObserver(this);
    }

    public void update(WetherData wehterData) {
        System.out.println("Received data in CurrentConditionsDisplayObserver");
        businessLogic(wehterData);
    }

    public void businessLogic(WetherData wehterData) {
        System.out.println("CurrentConditionsDisplayObserver: ");
        System.out.println(wehterData);
    }
}
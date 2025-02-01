package ObserverCode;

public class StatisticcDisplayObserver implements Observer {
    private WetherSubject wetherSubject;

    public StatisticcDisplayObserver(WetherSubject wetherSubject) {
        this.wetherSubject = wetherSubject;
        wetherSubject.registerObserver(this);
    }

    public void update(WetherData wehterData) {
        System.out.println("Received data in StatisticcDisplayObserver");
        businessLogic(wehterData);
    }

    public void businessLogic(WetherData wehterData) {
        System.out.println("StatisticcDisplayObserver: ");
        System.out.println(wehterData);
    }
}
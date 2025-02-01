package ObserverCode;

public class Main {
    public static void main(String[] args) {
        // Create Subject
        WetherSubject wetherSubject = new WetherSubject();

        // Create Observers
        CurrentConditionsDisplayObserver observer1 = new CurrentConditionsDisplayObserver(wetherSubject);
        StatisticcDisplayObserver observer2 = new StatisticcDisplayObserver(wetherSubject);

        // Changes happens in subject
        WetherData wetherData1 = new WetherData(80, 65, 34);
        WetherData wetherData2 = new WetherData(180, 135, 103);

        wetherSubject.setWetherData(wetherData1);
        wetherSubject.setWetherData(wetherData2);
    }
}
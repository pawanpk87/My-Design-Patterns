package StrategyCode;

public class Client {
    public static void main(String[] args) {
        Navigator navigator = new Navigator();

        navigator.setStrategy(new RoadRouteStrategy());
        navigator.buildRoute("Home", "Work");
    }
}
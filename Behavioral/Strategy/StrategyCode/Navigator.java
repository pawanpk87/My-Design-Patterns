package StrategyCode;

public class Navigator {
    private RouteStrategy routeStrategy;

    public void setStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void buildRoute(String source, String destination) {
        routeStrategy.buildRoute(source, destination);
    }
}
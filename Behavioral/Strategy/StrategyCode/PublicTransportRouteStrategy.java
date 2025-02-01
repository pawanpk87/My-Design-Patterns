package StrategyCode;

public class PublicTransportRouteStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String source, String destination) {
        System.out.println("Building public transport route from " + source + " to " + destination);
        // Implement public transport route algorithm
    }
}
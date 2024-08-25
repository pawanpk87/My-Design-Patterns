package BuilderCode.components;

public class Engine {
    private final double volume;
    private final double milage;
    private boolean isStarted;

    public Engine(double volume, double milage) {
        this.volume = volume;
        this.milage = milage;
    }

    public void on() {
        this.isStarted = true;
    }

    public void off() {
        this.isStarted = false;
    }

    public double getVolume() {
        return volume;
    }

    public double getMilage() {
        return milage;
    }

    public boolean isStarted() {
        return isStarted;
    }
}

package BuilderCode.cars;

import BuilderCode.builders.Builder;
import BuilderCode.components.Engine;

public class CarManualBuilder implements Builder {
    private CarType carType;
    private int seats;
    private Engine engine;

    @Override
    public void setCharType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car build() {
        return new Car(carType, seats, engine);
    }
}

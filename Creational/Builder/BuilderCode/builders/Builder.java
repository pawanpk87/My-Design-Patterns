package BuilderCode.builders;

import BuilderCode.cars.CarType;
import BuilderCode.components.Engine;

public interface Builder {
    void setCharType(CarType carType);

    void setSeats(int seats);

    void setEngine(Engine engine);
}

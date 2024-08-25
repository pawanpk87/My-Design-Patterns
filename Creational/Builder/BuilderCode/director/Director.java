package BuilderCode.director;

import BuilderCode.builders.*;
import BuilderCode.cars.CarType;
import BuilderCode.components.Engine;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setCharType(CarType.SPORTS_CAR);
        builder.setSeats(6);
        builder.setEngine(new Engine(3.7, 4.7));
        // some other properties of sports car
    }

    public void constructCityCar(Builder builder) {
        builder.setCharType(CarType.CITY_CAR);
        builder.setSeats(6);
        builder.setEngine(new Engine(2.7, 2.7));
        // some other properties of city car
    }
}

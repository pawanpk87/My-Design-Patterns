package BuilderCode;

import BuilderCode.cars.Car;
import BuilderCode.cars.CarBuilder;
import BuilderCode.director.Director;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);

        Car sportsCar = carBuilder.build();

        System.out.println(sportsCar);
    }
}

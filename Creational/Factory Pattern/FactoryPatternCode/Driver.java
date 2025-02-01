package FactorPatternCode;

import FactorPatternCode.factory.*;
import FactorPatternCode.model.*;

public class Driver {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new TwoWheelerFactory();

        Client client1 = new Client(vehicleFactory);
        client1.getVehicle().printVehicle();

        vehicleFactory = new FourWheelerFactory();

        Client client2 = new Client(vehicleFactory);
        client2.getVehicle().printVehicle();
    }
}
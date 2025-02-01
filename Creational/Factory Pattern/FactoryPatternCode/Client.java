package FactorPatternCode.factory;

import FactorPatternCode.factory.*;
import FactorPatternCode.model.*;

public class Client {
    private Vehicle vehicle;

    public Client(VehicleFactory vehicleFactory) {
        this.vehicle = vehicleFactory.createVehicle();
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }
}
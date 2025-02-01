package FactorPatternCode.factory;

import FactorPatternCode.model.Vehicle;
import FactorPatternCode.model.TwoWheeler;

public class TwoWheelerFactory implements VehicleFactory {

    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}
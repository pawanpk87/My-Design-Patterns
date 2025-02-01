package FactorPatternCode.factory;

import FactorPatternCode.model.Vehicle;
import FactorPatternCode.model.FourWheeler;


public class FourWheelerFactory implements VehicleFactory {

    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}
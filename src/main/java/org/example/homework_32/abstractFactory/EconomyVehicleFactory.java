package org.example.homework_32.abstractFactory;

public class EconomyVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle createCar() {
        return new EconomyCar();
    }

    @Override
    public Vehicle createMotorcycle() {
        return new EconomyMotorcycle();
    }
}

package org.example.homework_32.abstractFactory;

public class SportVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle createCar() {
        return new SportCar();
    }

    @Override
    public Vehicle createMotorcycle() {
        return new SportMotorcycle();
    }
}

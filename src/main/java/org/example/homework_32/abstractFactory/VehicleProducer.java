package org.example.homework_32.abstractFactory;

public class VehicleProducer {

    private final VehicleFactory vehicleFactory;

    public VehicleProducer(VehicleFactory vehicleFactory){
        this.vehicleFactory = vehicleFactory;
    }

    public Vehicle produceCar(){
        return vehicleFactory.createCar();
    }

    public Vehicle produceMotorcycle(){
        return vehicleFactory.createMotorcycle();
    }

}

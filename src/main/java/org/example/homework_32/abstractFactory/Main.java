package org.example.homework_32.abstractFactory;

public class Main {
    public static void main(String[] args) {
        VehicleProducer economyVehicleProducer = new VehicleProducer(new EconomyVehicleFactory());
        VehicleProducer sportVehicleProducer = new VehicleProducer(new SportVehicleFactory());

        Vehicle economyCar = economyVehicleProducer.produceCar();
        Vehicle economyMotorcycle = economyVehicleProducer.produceMotorcycle();

        Vehicle sportCar = sportVehicleProducer.produceCar();
        Vehicle sportMotorcycle = sportVehicleProducer.produceMotorcycle();

        System.out.println(economyCar.getDescription());
        System.out.println(economyMotorcycle.getDescription());
        System.out.println(sportCar.getDescription());
        System.out.println(sportMotorcycle.getDescription());

    }
}

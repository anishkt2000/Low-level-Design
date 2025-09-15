package DesignPattern.AbstractFactory;

public class LuxuryVehicleFact implements VehicleFactory{
    @Override
    public Car createCar() {
        return new LuxaryCar();
    }

    @Override
    public Bike createBike() {
        return new LuxuryBike();
    }
}

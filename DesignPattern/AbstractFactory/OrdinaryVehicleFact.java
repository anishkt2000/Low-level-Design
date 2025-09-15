package DesignPattern.AbstractFactory;

public class OrdinaryVehicleFact implements VehicleFactory {
    @Override
    public Car createCar() {
        return new OrdinaryCar();
    }

    @Override
    public Bike createBike() {
        return new OrdinaryBike();
    }
}

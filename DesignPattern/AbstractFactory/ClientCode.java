package DesignPattern.AbstractFactory;

public class ClientCode {
    public static void main(String[] args) {
        VehicleFactory factory = new LuxuryVehicleFact();
        Car car = factory.createCar();
        Bike bike = factory.createBike();

        car.drive();
        bike.ride();
    }
}

package DesignPattern.Strategy;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle() {
        super(new DesignPattern.Strategy.NormalDrive());
    }
}

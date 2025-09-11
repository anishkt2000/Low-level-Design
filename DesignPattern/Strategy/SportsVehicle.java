package DesignPattern.Strategy;
import DesignPattern.Strategy.StrategyDrive.SpecialDrive;
import DesignPattern.Strategy.Vehicle;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SpecialDrive());
    }
}
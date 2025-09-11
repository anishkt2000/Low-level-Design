package DesignPattern.Strategy;

import DesignPattern.Strategy.StrategyDrive.DriveStrategy;

public class Vehicle{
    DriveStrategy driveStrategy;
    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }
    public void performDrive() {
        driveStrategy.drive();
    }
}
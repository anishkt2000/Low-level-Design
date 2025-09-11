package DesignPattern.Strategy;

import DesignPattern.Strategy.StrategyDrive.DriveStrategy;

public class NormalDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving in normal mode.");
    }
}

package DesignPattern.Strategy.StrategyDrive;

public class SpecialDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Driving in special mode.");
    }
}

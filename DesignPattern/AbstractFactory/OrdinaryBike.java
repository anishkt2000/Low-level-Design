package DesignPattern.AbstractFactory;

public class OrdinaryBike implements Bike{
    @Override
    public void ride() {
        System.out.println("Riding an ordinary bike.");
    }
}

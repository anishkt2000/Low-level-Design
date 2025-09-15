package DesignPattern.AbstractFactory;

public class OrdinaryCar implements Car{
    @Override
    public void drive() {
        System.out.println("Driving an ordinary car.");
    }
}

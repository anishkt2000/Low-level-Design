package DesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class WsObservableImp implements WeatherStationInterface{
    private int currentTemperature;
    List<DisplayObserver> displayList;
    WsObservableImp(){
        this.currentTemperature=0;
        this.displayList=new ArrayList<>();
    }
    @Override
    public void addObserver(DisplayObserver observer) {
        this.displayList.add(observer);
    }

    @Override
    public void removeObserver(DisplayObserver observer) {
        this.displayList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(DisplayObserver display : displayList){
            display.update();
        }
    }

    @Override
    public void setTemperature(int temperature) {
        this.currentTemperature=temperature;
        this.notifyObservers();
    }

    @Override
    public float getTemperature() {
        return currentTemperature;
    }
}

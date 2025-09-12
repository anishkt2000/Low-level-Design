package DesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class WsObservableImp implements WeatherStationInterface{
    private int data;
    List<DisplayObserver> displayList;
    WsObservableImp(){
        this.data=0;
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
    public void setData(int data) {
        this.data=data;
        this.notifyObservers();
    }

    @Override
    public float getData() {
        return this.data;
    }
}

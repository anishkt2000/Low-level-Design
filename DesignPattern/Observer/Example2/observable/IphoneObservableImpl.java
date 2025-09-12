package DesignPattern.Observer.Example2.observable;

import DesignPattern.Observer.Example2.observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable{
    private List<NotificationObserver> observers;
    private int count;
    public IphoneObservableImpl(){
        this.count=0;
        this.observers=new ArrayList<>();
    }
    @Override
    public void addObserver(NotificationObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(NotificationObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(NotificationObserver observer : observers){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int cnt) {
        if(this.count ==0){
            this.notifyObservers();
        }
           this.count= this.count+ cnt;
    }

    @Override
    public int getStockCount() {
        // TODO Auto-generated method stub
        return this.count;
    }
}

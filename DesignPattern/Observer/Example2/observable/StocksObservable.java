package DesignPattern.Observer.Example2.observable;

import DesignPattern.Observer.Example2.observer.NotificationObserver;

public interface StocksObservable {
    public void addObserver(NotificationObserver observer);
    public void removeObserver(NotificationObserver observer);
    public void notifyObservers();
    public void setStockCount(int cnt);
    public int getStockCount();
}

package DesignPattern.Observer.Example2.observer;

import DesignPattern.Observer.Example2.observable.StocksObservable;

public class EmailNotificationImpl implements NotificationObserver{
    StocksObservable observable;
    public EmailNotificationImpl(StocksObservable obs){
        this.observable=obs;
    }
    @Override
    public void update() {
        System.out.println("Sending Email Notification to the user");
    }
}

package DesignPattern.Observer.Example2.observer;

import DesignPattern.Observer.Example2.observable.StocksObservable;

public class SmsNotificationImpl implements NotificationObserver{
    StocksObservable observable;
    public SmsNotificationImpl(StocksObservable obs){
        this.observable=obs;
    }

    @Override
    public void update() {
        System.out.println("Sending SMS Notification to the user");
    }
}

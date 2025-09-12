package DesignPattern.Observer.Example2.observer;

import DesignPattern.Observer.Example2.observable.StocksObservable;
import DesignPattern.Observer.WeatherStationInterface;

public class WhatsAppNotificationImpl implements NotificationObserver{
    StocksObservable observable;
    public WhatsAppNotificationImpl(StocksObservable obs){
        this.observable=obs;
    }
    @Override
    public void update() {
        System.out.println("Sending WhatsApp Notification to the user");
    }
}

package DesignPattern.Observer.Example2;

import DesignPattern.Observer.Example2.observable.IphoneObservableImpl;
import DesignPattern.Observer.Example2.observable.StocksObservable;
import DesignPattern.Observer.Example2.observer.EmailNotificationImpl;
import DesignPattern.Observer.Example2.observer.NotificationObserver;
import DesignPattern.Observer.Example2.observer.SmsNotificationImpl;
import DesignPattern.Observer.Example2.observer.WhatsAppNotificationImpl;

public class Stocks {

    public static void main(String[] args) {
        StocksObservable stocksObservable =new IphoneObservableImpl();

        NotificationObserver emailObserver =new EmailNotificationImpl(stocksObservable);
        NotificationObserver smsObserver =new WhatsAppNotificationImpl(stocksObservable);
        NotificationObserver whatsAppObserver =new SmsNotificationImpl(stocksObservable);

        stocksObservable.addObserver(emailObserver);
        stocksObservable.addObserver(smsObserver);
        stocksObservable.addObserver(whatsAppObserver);
        stocksObservable.setStockCount(10);
        stocksObservable.setStockCount(0);

    }




}

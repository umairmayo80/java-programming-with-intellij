package BehavioralDesignPatterns.ObserverPattern;

import BehavioralDesignPatterns.ObserverPattern.Observable.IphoneObservableImpl;
import BehavioralDesignPatterns.ObserverPattern.Observable.StocksObservable;
import BehavioralDesignPatterns.ObserverPattern.Observer.EmailAlterObserverImpl;
import BehavioralDesignPatterns.ObserverPattern.Observer.MobileAlertObserverImpl;
import BehavioralDesignPatterns.ObserverPattern.Observer.NotificationAlertObserver;


/*
* Amazon has the notify me button to send alter messages when the item is stocked back, an example to implement that
* using observer design pattern
* */



public class Main {
    public static void main(String[] args){
        StocksObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlterObserverImpl("xzy@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlterObserverImpl("abc@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("user123",iphoneStockObservable);


        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);


    }
}

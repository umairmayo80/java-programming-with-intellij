package BehavioralDesignPatterns.ObserverPattern.Observer;

import BehavioralDesignPatterns.ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String username;
    StocksObservable observable; // to keep track what item stock we want to observe and we may want to access it`s data in future
    public MobileAlertObserverImpl(String username, StocksObservable observable){
        this.username = username;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendSMS(username, "Stock is back");
    }

    private void sendSMS(String username, String msg){
        System.out.println("sms sent to" + username);
    }
}
package BehavioralDesignPatterns.ObserverPattern.Observable;

import BehavioralDesignPatterns.ObserverPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {
    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void notifyUser();
    void setStockCount(int newStockCount);
    int getStockCount();

}

package BehavioralDesignPatterns.ObserverPattern.Observable;

import BehavioralDesignPatterns.ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable {
    private List<NotificationAlertObserver> observersList = new ArrayList<>();
    private int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observersList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observersList.remove(observer);
    }

    @Override
    public void notifyUser() {
        observersList.forEach(NotificationAlertObserver::update);
    }

    @Override
    public void setStockCount(int stockCount) {
        if(this.stockCount == 0){
            notifyUser();
        }
        this.stockCount = this.stockCount+ stockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}

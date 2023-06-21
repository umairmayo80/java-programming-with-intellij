package BehavioralDesignPatterns.ObserverPattern.Observer;

import BehavioralDesignPatterns.ObserverPattern.Observable.StocksObservable;

public class EmailAlterObserverImpl implements NotificationAlertObserver {
    String emailId;
    StocksObservable observable;
    public EmailAlterObserverImpl(String emailId, StocksObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
            sendMail(emailId,"product is back stocked");
    }

    private void sendMail(String emailId, String msg){
        System.out.println("mail sent to:"+ emailId);
    }
}

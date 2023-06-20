package BehavioralDesignPatterns.StrategyPattern.WithPattern;

import BehavioralDesignPatterns.StrategyPattern.NoPattern.GoodsVehicle;

public class Main {
    public static void main(String[] args){
        Vehicle vehicle = new OffRoadVehicle();
        vehicle.driveStrategy.drive();
    }

}

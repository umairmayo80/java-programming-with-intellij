package BehavioralDesignPatterns.StrategyPattern.WithPattern;

import BehavioralDesignPatterns.StrategyPattern.WithPattern.DriveStrategy.HighDriveStrategyImpl;

public class SportsVehicle extends Vehicle {
    SportsVehicle(){
        super(new HighDriveStrategyImpl());
    }

}

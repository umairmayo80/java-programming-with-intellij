package BehavioralDesignPatterns.StrategyPattern.WithPattern;

import BehavioralDesignPatterns.StrategyPattern.WithPattern.DriveStrategy.HighDriveStrategyImpl;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle(){
        super(new HighDriveStrategyImpl());
    }
}

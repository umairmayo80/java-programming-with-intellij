package BehavioralDesignPatterns.StrategyPattern.WithPattern;

import BehavioralDesignPatterns.StrategyPattern.WithPattern.DriveStrategy.DriveStrategy;

public class Vehicle {
    // create composition of of the drive strategy
    DriveStrategy driveStrategy; // vehicle has drive strategy

    // initialize the drive strategy using constructor injection
    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }
}

package BehavioralDesignPatterns.StrategyPattern.WithPattern.DriveStrategy;

public class NormalDriveStragtegyImpl implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Drive Strategy");
    }
}

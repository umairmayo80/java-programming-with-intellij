package BehavioralDesignPatterns.StrategyPattern.WithPattern.DriveStrategy;

public class HighDriveStrategyImpl implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("High Drive Strategy");
    }
}

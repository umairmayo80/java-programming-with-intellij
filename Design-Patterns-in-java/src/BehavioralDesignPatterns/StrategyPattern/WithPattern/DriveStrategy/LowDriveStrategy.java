package BehavioralDesignPatterns.StrategyPattern.WithPattern.DriveStrategy;

public class LowDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Low Drive Strategy");
    }
}

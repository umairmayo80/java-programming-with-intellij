package BehavioralDesignPatterns.StrategyPattern.NoPattern;

public class OffRoadVehicle extends Vehicle {
    @Override
    public void drive() {
        System.out.println("High Capability"); // code repetition, similarly if we have multiple other options and the there is code repetition then it is wrong
    }
}

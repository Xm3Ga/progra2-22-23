package main;

public class ExhaustedClimbing implements ClimbingPhases{
    @Override
    public double ascending() {
        return (int) ((Math.random() * 1) + 1);
    }
}
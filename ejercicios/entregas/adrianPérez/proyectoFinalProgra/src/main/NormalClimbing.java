package main;

public class NormalClimbing implements ClimbingPhases{
    @Override
    public double ascending() {
        return (int) ((Math.random() * 3) + 1);
    }
}
package main;

public class FatiguedClimbing implements ClimbingPhases{
    @Override
    public double ascending() {
        return (int) ((Math.random() * 2) + 1);
    }
}
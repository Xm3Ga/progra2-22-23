package main;

public class FatiguedClimbing {
    private double ascending = calculateClimbing();
    public int calculateClimbing(){
        return (int) (Math.random() * (3-1+1)+1);
    }
}

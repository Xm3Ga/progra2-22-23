package main;

public interface ClimbingPhases {

    public double ascending();

    public static double falling(){
        double fall = (Math.random()*2);
        return Math.round(fall*100.00)/100.00;
    }

}
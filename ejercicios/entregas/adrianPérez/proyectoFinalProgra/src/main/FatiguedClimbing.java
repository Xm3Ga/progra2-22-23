package main;

public class FatiguedClimbing implements ClimbingPhases{
    
    Snail snail = new Snail();
    
    public void ascending() {
        double fallDistance = Math.random();
        if (fallDistance < 1/3) {
            snail.setSnailDepth(snail.getSnailDepth() - 1);
            System.out.println("The snail climbed 1 meter during the day");
        } else if (fallDistance < 2/3){
            snail.setSnailDepth(snail.getSnailDepth() - 2);
            System.out.println("The snail climbed 2 meters during the day");
        } else {
            snail.setSnailDepth(snail.getSnailDepth() - 3);
            System.out.println("The snail climbed 3 meters during the day");
        }
    }

    public void falling() {
        double fallDistance = Math.random();
        if (fallDistance < 1/3) {
            snail.setSnailDepth(snail.getSnailDepth() + 1);
        } else if (fallDistance < 2/3) {
            snail.setSnailDepth(snail.getSnailDepth() + 2);
        } else {
            snail.setSnailDepth(snail.getSnailDepth() + 0);
        }
    }
}
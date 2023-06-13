package main;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class NormalClimbingTest extends NormalClimbing {

    @Test
    public void testAscendingWithFallDistanceLessThan0_25() {
        Snail snail = new Snail();
        snail.setSnailDepth(15);
        double fallDistance = 0.8;
        if (fallDistance < 0.25) {
            snail.setSnailDepth(snail.getSnailDepth() - 1);
        } else if (fallDistance < 0.5){
            snail.setSnailDepth(snail.getSnailDepth() - 2);
        } else if (fallDistance < 0.75){
            snail.setSnailDepth(snail.getSnailDepth() - 3);
        } else {
            snail.setSnailDepth(snail.getSnailDepth() - 4);
        }
        assertEquals(11, snail.getSnailDepth());
    }

    @Test
    public void testAscendingWithFallDistanceMoreThan0_75() {
        Snail snail = new Snail();
        snail.setSnailDepth(15);
        double fallDistance = 0.2;
        if (fallDistance < 0.25) {
            snail.setSnailDepth(snail.getSnailDepth() - 1);
        } else if (fallDistance < 0.5){
            snail.setSnailDepth(snail.getSnailDepth() - 2);
        } else if (fallDistance < 0.75){
            snail.setSnailDepth(snail.getSnailDepth() - 3);
        } else {
            snail.setSnailDepth(snail.getSnailDepth() - 4);
        }
        assertEquals(14, snail.getSnailDepth());      
    }
}
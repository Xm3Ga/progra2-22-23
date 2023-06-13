package main;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class FatiguedClimbingTest extends FatiguedClimbing {

    @Test
    public void testAscendingWithFallDistanceMoreThan0_33() {
        Snail snail = new Snail();
        snail.setSnailDepth(15);
        double fallDistance = 0.2;
        if (fallDistance < 1/3) {
            snail.setSnailDepth(snail.getSnailDepth() - 1);
        } else if (fallDistance < 2/3) {
            snail.setSnailDepth(snail.getSnailDepth() - 2);
        } else {
            snail.setSnailDepth(snail.getSnailDepth() - 3);
        }
        assertEquals(12, snail.getSnailDepth());
    }

    @Test
    public void testAscendingWithFallDistanceMoreThan0_66() {
        Snail snail = new Snail();
        snail.setSnailDepth(15);
        double fallDistance = 0.70;
        if (fallDistance < 1/3) {
            snail.setSnailDepth(snail.getSnailDepth() - 1);
        } else if (fallDistance < 2/3) {
            snail.setSnailDepth(snail.getSnailDepth() - 2);
        } else {
            snail.setSnailDepth(snail.getSnailDepth() - 3);
        }
        assertEquals(12, snail.getSnailDepth());
    }
}
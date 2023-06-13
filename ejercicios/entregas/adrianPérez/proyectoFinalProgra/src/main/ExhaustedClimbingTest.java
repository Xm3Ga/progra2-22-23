package main;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class ExhaustedClimbingTest extends ExhaustedClimbing {

    @Test
    public void testAscendingWithFallDistanceLessThan0_5() {
        Snail snail = new Snail();
        snail.setSnailDepth(15);
        double fallDistance = 0.4;
        if (fallDistance < 0.5) {
            snail.setSnailDepth(snail.getSnailDepth() - 1);
        } else {
            snail.setSnailDepth(snail.getSnailDepth() - 2);
        }
        assertEquals(14, snail.getSnailDepth());
    }

    @Test
    public void testAscendingWithFallDistanceMoreThan0_5() {
        Snail snail = new Snail();
        snail.setSnailDepth(15);
        double fallDistance = 0.6;
        if (fallDistance < 0.5) {
            snail.setSnailDepth(snail.getSnailDepth() - 1);
        } else {
            snail.setSnailDepth(snail.getSnailDepth() - 2);
        }
        assertEquals(13, snail.getSnailDepth());
        
    }
}
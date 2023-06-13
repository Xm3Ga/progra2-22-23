package main;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class WeatherConditionWorseTest extends WeatherConditionWorse{

    @Test
    public void testIfRainWorse() {
        Snail snail = new Snail();
        snail.setWaterDepth(18);
        double rainProbability = 0.03;
        if (rainProbability < 0.05) {
            snail.setWaterDepth(snail.getWaterDepth() - 5);
        } else {
            snail.setWaterDepth(snail.getWaterDepth() - 0);
        }
        assertEquals(13, snail.getWaterDepth());  
    }

    @Test
    public void testIfNotRainWorse() {
        Snail snail = new Snail();
        snail.setWaterDepth(18);
        double rainProbability = 0.33;
        if (rainProbability < 0.05) {
            snail.setWaterDepth(snail.getWaterDepth() - 5);
        } else {
            snail.setWaterDepth(snail.getWaterDepth() - 0);
        }
        assertEquals(18, snail.getWaterDepth());  
    } 
}
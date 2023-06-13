package main;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class WeatherConditionBadTest extends WeatherConditionBad{

    @Test
    public void testIfRainBad() {
        Snail snail = new Snail();
        snail.setWaterDepth(18);
        double rainProbability = 0.03;
        if (rainProbability < 0.10) {
            snail.setWaterDepth(snail.getWaterDepth() - 2);
        } else {
            snail.setWaterDepth(snail.getWaterDepth() - 0);
        }
        assertEquals(16, snail.getWaterDepth());  
    }

    @Test
    public void testIfNotRainBad() {
        Snail snail = new Snail();
        snail.setWaterDepth(18);
        double rainProbability = 0.33;
        if (rainProbability < 0.10) {
            snail.setWaterDepth(snail.getWaterDepth() - 2);
        } else {
            snail.setWaterDepth(snail.getWaterDepth() - 0);
        }
        assertEquals(18, snail.getWaterDepth());  
    } 
}
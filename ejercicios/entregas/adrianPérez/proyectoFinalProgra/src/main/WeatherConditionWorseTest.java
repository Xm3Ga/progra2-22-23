package main;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class WeatherConditionWorseTest extends WeatherConditionWorse{

    @Test
    public void testIfRainWorse() {
        Snail snail = new Snail();
        snail.setProfundidadAgua(18);
        double probabilidadLluvia = 0.03;
        if (probabilidadLluvia < 0.05) {
            snail.setProfundidadAgua(snail.getProfundidadAgua() - 5);
        } else {
            snail.setProfundidadAgua(snail.getProfundidadAgua() - 0);
        }
        assertEquals(13, snail.getProfundidadAgua());  
    }

    @Test
    public void testIfNotRainWorse() {
        Snail snail = new Snail();
        snail.setProfundidadAgua(18);
        double probabilidadLluvia = 0.33;
        if (probabilidadLluvia < 0.05) {
            snail.setProfundidadAgua(snail.getProfundidadAgua() - 5);
        } else {
            snail.setProfundidadAgua(snail.getProfundidadAgua() - 0);
        }
        assertEquals(18, snail.getProfundidadAgua());  
    } 
}
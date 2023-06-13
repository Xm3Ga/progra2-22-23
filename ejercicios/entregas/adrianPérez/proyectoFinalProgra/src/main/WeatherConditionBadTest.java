package main;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class WeatherConditionBadTest extends WeatherConditionBad{

    @Test
    public void testIfRainBad() {
        Snail snail = new Snail();
        snail.setProfundidadAgua(18);
        double probabilidadLluvia = 0.03;
        if (probabilidadLluvia < 0.10) {
            snail.setProfundidadAgua(snail.getProfundidadAgua() - 2);
        } else {
            snail.setProfundidadAgua(snail.getProfundidadAgua() - 0);
        }
        assertEquals(16, snail.getProfundidadAgua());  
    }

    @Test
    public void testIfNotRainBad() {
        Snail snail = new Snail();
        snail.setProfundidadAgua(18);
        double probabilidadLluvia = 0.33;
        if (probabilidadLluvia < 0.10) {
            snail.setProfundidadAgua(snail.getProfundidadAgua() - 2);
        } else {
            snail.setProfundidadAgua(snail.getProfundidadAgua() - 0);
        }
        assertEquals(18, snail.getProfundidadAgua());  
    } 
}
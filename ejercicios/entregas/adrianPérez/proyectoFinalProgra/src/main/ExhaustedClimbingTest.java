package main;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class ExhaustedClimbingTest extends ExhaustedClimbing {

    @Test
    public void testAscendingWithTamañoCaidaLessThan0_5() {
        Snail snail = new Snail();
        snail.setProfundidadCaracol(15);
        double tamañoCaida = 0.4;
        if (tamañoCaida < 0.5) {
            snail.setProfundidadCaracol(snail.getProfundidadCaracol() - 1);
        } else {
            snail.setProfundidadCaracol(snail.getProfundidadCaracol() - 2);
        }
        assertEquals(14, snail.getProfundidadCaracol());
    }

    @Test
    public void testAscendingWithTamañoCaidaMoreThan0_5() {
        Snail snail = new Snail();
        snail.setProfundidadCaracol(15);
        double tamañoCaida = 0.6;
        if (tamañoCaida < 0.5) {
            snail.setProfundidadCaracol(snail.getProfundidadCaracol() - 1);
        } else {
            snail.setProfundidadCaracol(snail.getProfundidadCaracol() - 2);
        }
        assertEquals(13, snail.getProfundidadCaracol());
        
    }
}
package main;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class FatiguedClimbingTest extends FatiguedClimbing {

    @Test
    public void testAscendingWithTamañoCaidaMoreThan0_33() {
        Snail snail = new Snail();
        snail.setProfundidadCaracol(15);
        double tamañoCaida = 0.2;
        if (tamañoCaida < 1/3) {
            snail.setProfundidadCaracol(snail.getProfundidadCaracol() - 1);
        } else if (tamañoCaida < 2/3) {
            snail.setProfundidadCaracol(snail.getProfundidadCaracol() - 2);
        } else {
            snail.setProfundidadCaracol(snail.getProfundidadCaracol() - 3);
        }
        assertEquals(12, snail.getProfundidadCaracol());
    }

    @Test
    public void testAscendingWithTamañoCaidaMoreThan0_66() {
        Snail snail = new Snail();
        snail.setProfundidadCaracol(15);
        double tamañoCaida = 0.70;
        if (tamañoCaida < 1/3) {
            snail.setProfundidadCaracol(snail.getProfundidadCaracol() - 1);
        } else if (tamañoCaida < 2/3) {
            snail.setProfundidadCaracol(snail.getProfundidadCaracol() - 2);
        } else {
            snail.setProfundidadCaracol(snail.getProfundidadCaracol() - 3);
        }
        assertEquals(12, snail.getProfundidadCaracol());
    }
}
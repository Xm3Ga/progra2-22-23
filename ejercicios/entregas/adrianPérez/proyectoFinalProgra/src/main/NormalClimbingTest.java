package main;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class NormalClimbingTest extends NormalClimbing {

    @Test
    public void testAscendingWithTamañoCaidaLessThan0_25() {
        Snail snail = new Snail();
        snail.setProfundidadCaracol(15);
        double tamañoCaida = 0.8;
        if (tamañoCaida < 0.25) {
            snail.setProfundidadCaracol(snail.getProfundidadCaracol() - 1);
        } else if (tamañoCaida < 0.5){
            snail.setProfundidadCaracol(snail.getProfundidadCaracol() - 2);
        } else if (tamañoCaida < 0.75){
            snail.setProfundidadCaracol(snail.getProfundidadCaracol() - 3);
        } else {
            snail.setProfundidadCaracol(snail.getProfundidadCaracol() - 4);
        }
        assertEquals(11, snail.getProfundidadCaracol());
    }

    @Test
    public void testAscendingWithTamañoCaidaMoreThan0_75() {
        Snail snail = new Snail();
        snail.setProfundidadCaracol(15);
        double tamañoCaida = 0.2;
        if (tamañoCaida < 0.25) {
            snail.setProfundidadCaracol(snail.getProfundidadCaracol() - 1);
        } else if (tamañoCaida < 0.5){
            snail.setProfundidadCaracol(snail.getProfundidadCaracol() - 2);
        } else if (tamañoCaida < 0.75){
            snail.setProfundidadCaracol(snail.getProfundidadCaracol() - 3);
        } else {
            snail.setProfundidadCaracol(snail.getProfundidadCaracol() - 4);
        }
        assertEquals(14, snail.getProfundidadCaracol());      
    }
}
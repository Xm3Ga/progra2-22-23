package main;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class SnailTest extends Snail{

    @Test
    public void snailStarts() {
        int alturaInicial = 13;
        assertEquals(13, alturaInicial);
    }
}
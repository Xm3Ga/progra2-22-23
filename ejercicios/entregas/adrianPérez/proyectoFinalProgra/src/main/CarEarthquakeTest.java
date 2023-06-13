package main;
import org.junit.Assert;
import org.junit.Test;

public class CarEarthquakeTest extends CarEarthquake {

    @Test
    public void testNoEarthquake() {
        CarEarthquake noCarEarthquake = new CarEarthquake();
        noCarEarthquake.setCar(false);
        Assert.assertFalse(noCarEarthquake.isCar());        
    }

    @Test
    public void testEarthquake() {
        CarEarthquake carEarthquake = new CarEarthquake();
        carEarthquake.setCar(true);
        Assert.assertTrue(carEarthquake.isCar());
    }
}
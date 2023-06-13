package main;

public class CarEarthquake extends AbstractCarEarthquake{

    Snail snail = new Snail();

    public void carEarthquake() {
        double fallDistance = Math.random();
        if (fallDistance < 0.35) {
            snail.setSnailDepth(snail.getSnailDepth() + 2);
            car = true;
            System.out.println("There was an earthquake and the snail fell 2 meters");
        } 
    }

    public boolean isCar() {
        return car;
    }

    public void setCar(boolean car) {
        this.car = car;
    }
}
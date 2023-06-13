package main;

public class CarEarthquake extends AbstractCarEarthquake{

    Snail snail = new Snail();

    public void carEarthquake() {
        double tamañoCaida = Math.random();
        if (tamañoCaida < 0.35) {
            snail.setProfundidadCaracol(snail.getProfundidadCaracol() + 2);
            car = true;
            System.out.println("Hubo un temblor!");
        } 
    }

    public boolean isCar() {
        return car;
    }

    public void setCar(boolean car) {
        this.car = car;
    }
}
package main;

public class CarEarthquake {

    Snail snail = new Snail();

    private boolean car = false;

    public boolean isCar() {
        return car;
    }
    public void setCar(boolean car) {
        this.car = car;
    }



    public void carEarthquake() {
        double tamañoCaida = Math.random();
        if (tamañoCaida < 0.35) {
            snail.setProfundidadCaracol(snail.getProfundidadCaracol() + 2);
            car = true;
            System.out.println("Ce cayo");
        } 
    }
}

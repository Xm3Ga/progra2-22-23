package main;

public class CarEarthquake extends CEquakeAbstract{

    public void carEarthquake() {
        double tamañoCaida = Math.random();
        if (tamañoCaida < 0.35) {
            snail.setProfundidadCaracol(snail.getProfundidadCaracol() + 2);
            car = true;
            System.out.println("Hubo un temblor!");
        } 
    }
}
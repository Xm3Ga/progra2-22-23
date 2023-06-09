package main;

public class CarEarthquake {

    Snail snail = new Snail();

    public void carEarthquake() {
        double tamañoCaida = Math.random();
        if (tamañoCaida < 0.35) {
            snail.setProfundidadCaracol(snail.getProfundidadCaracol() + 2);
            System.out.println("El caracol se ha caido");
        } 
    }
}

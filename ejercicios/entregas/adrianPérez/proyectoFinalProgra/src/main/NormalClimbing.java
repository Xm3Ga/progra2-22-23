package main;

public class NormalClimbing implements ClimbingPhases{
    
    Snail snail = new Snail();
    
    
    public void ascending() {
        double tamañoCaida = Math.random();
        if (tamañoCaida < 0.25) {
            snail.setProfundidadCaracol(snail.getProfundidadCaracol() - 1);
        } else if (tamañoCaida < 0.5){
            snail.setProfundidadCaracol(snail.getProfundidadCaracol() - 2);
        } else if (tamañoCaida < 0.75){
            snail.setProfundidadCaracol(snail.getProfundidadCaracol() - 3);
        } else {
            snail.setProfundidadCaracol(snail.getProfundidadCaracol() - 4);
        }
    }

    public void falling() {
        double tamañoCaida = Math.random();
        if (tamañoCaida < 1/3) {
            snail.setProfundidadCaracol(snail.getProfundidadCaracol() + 1);
        } else if (tamañoCaida < 2/3) {
            snail.setProfundidadCaracol(snail.getProfundidadCaracol() + 2);
        } else {
            snail.setProfundidadCaracol(snail.getProfundidadCaracol() + 0);
        }
    }
}
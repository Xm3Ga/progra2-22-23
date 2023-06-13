package main;

public class ExhaustedClimbing implements ClimbingPhases{

    Snail snail = new Snail();
    
    public void ascending() {
        double tamañoCaida = Math.random();
        if (tamañoCaida < 0.5) {
            snail.setProfundidadCaracol(snail.getProfundidadCaracol() - 1);
            System.out.println("El caracol subió 1 metro durante el dia");
        } else {
            snail.setProfundidadCaracol(snail.getProfundidadCaracol() - 2);
            System.out.println("El caracol subió 2 metros durante el dia");
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
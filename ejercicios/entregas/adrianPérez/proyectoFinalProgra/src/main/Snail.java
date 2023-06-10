package main;

public class Snail {
    
    static double profundidadAgua = 20;
    static int profundidadCaracol = 0;
    static int dia = 0;
    public Snail() {
    }

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        Snail.dia = dia;
    }
    public double getProfundidadCaracol() {
        return profundidadCaracol;
    }
    public void setProfundidadCaracol(double profundidadCaracol) {
        Snail.profundidadCaracol = (int) profundidadCaracol;
    }
    public double getProfundidadAgua() {
        return profundidadAgua;
    }
    public void setProfundidadAgua(double profundidadAgua) {
        Snail.profundidadAgua = profundidadAgua;
    }

    public int AlturaInicialCaracol() {
        int alturaInicial = (int) ((Math.random()*10)+10);
        profundidadCaracol = alturaInicial;
        return alturaInicial;
    }
}

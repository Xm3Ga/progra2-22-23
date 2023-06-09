package main;

public class Snail {
    private double profundidadAgua = 20;
    private double profundidadCaracol = 0;
    private int dia = 0;

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public double getProfundidadCaracol() {
        return profundidadCaracol;
    }
    public void setProfundidadCaracol(double profundidadCaracol) {
        this.profundidadCaracol = profundidadCaracol;
    }
    public double getProfundidadAgua() {
        return profundidadAgua;
    }
    public void setProfundidadAgua(double profundidadAgua) {
        this.profundidadAgua = profundidadAgua;
    }

    public int AlturaInicialCaracol() {
        double alturaInicial = (Math.random()*10)+10;
        return (int) alturaInicial;
    }
}

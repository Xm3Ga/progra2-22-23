package main;

public class Snail {
    private double profundidadAgua = 20;
    private int profundidadCaracol = 0;
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
        this.profundidadCaracol = (int) profundidadCaracol;
    }
    public double getProfundidadAgua() {
        return profundidadAgua;
    }
    public void setProfundidadAgua(double profundidadAgua) {
        this.profundidadAgua = profundidadAgua;
    }

    public int AlturaInicialCaracol() {
        int alturaInicial = (int) ((Math.random()*10)+10);
        profundidadCaracol = alturaInicial;
        return alturaInicial;
    }
}

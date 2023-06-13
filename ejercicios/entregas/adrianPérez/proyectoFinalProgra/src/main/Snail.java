package main;

public class Snail extends AbstractSnail{
    
    public Snail() {
    }

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        AbstractSnail.dia = dia;
    }
    public double getProfundidadCaracol() {
        return profundidadCaracol;
    }
    public void setProfundidadCaracol(double profundidadCaracol) {
        AbstractSnail.profundidadCaracol = (int) profundidadCaracol;
    }
    public double getProfundidadCaracolTemp() {
        return profundidadCaracolTemp;
    }
    public void setProfundidadCaracolTemp(double profundidadCaracolTemp) {
        AbstractSnail.profundidadCaracolTemp = (int) profundidadCaracolTemp;
    }
    public double getProfundidadAgua() {
        return profundidadAgua;
    }
    public void setProfundidadAgua(double profundidadAgua) {
        AbstractSnail.profundidadAgua = profundidadAgua;
    }

    public int AlturaInicialCaracol() {
        int alturaInicial = (int) Math.floor(Math.random() * 11) + 10;
        profundidadCaracol = alturaInicial;
        profundidadCaracolTemp = alturaInicial;
        return alturaInicial;
    }
}

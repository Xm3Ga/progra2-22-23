package main;

public abstract class AbstractSnail {
    
    static double profundidadAgua = 20;
    static int profundidadCaracol = 0;
    static int profundidadCaracolTemp = 0;
    static int dia = 0;

    abstract int getDia();

    abstract void setDia(int dia);
    abstract double getProfundidadCaracol();
    abstract void setProfundidadCaracol(double profundidadCaracol);
    abstract double getProfundidadCaracolTemp();
    abstract void setProfundidadCaracolTemp(double profundidadCaracolTemp);
    abstract double getProfundidadAgua();
    abstract void setProfundidadAgua(double profundidadAgua);

    abstract int AlturaInicialCaracol();
}

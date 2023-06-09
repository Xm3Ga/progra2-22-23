package main;

public abstract class WeatherContitionAbstract implements WeatherCondition{
    private double profundidadAgua = 20;
    public double getProfundidadAgua() {
        return profundidadAgua;
    }
    public void setProfundidadAgua(double profundidadAgua) {
        this.profundidadAgua = profundidadAgua;
    }
    public void subidaAguaLLuvia() {

    }
    
}
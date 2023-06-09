package main;

public class WeatherConditionBad extends WeatherContitionAbstract{
    public void subidaAguaLLuvia(){
        setProfundidadAgua(getProfundidadAgua() - 2);
        System.out.println("Lueve levemente");
    }
}

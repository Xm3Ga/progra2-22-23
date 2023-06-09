package main;

public class WeatherConditionBad implements WeatherCondition{

    Snail snail = new Snail();

    public void subidaAguaLLuvia(){
        snail.setProfundidadAgua(snail.getProfundidadAgua() - 2);
        System.out.println("LLueve levemente");
    }
}

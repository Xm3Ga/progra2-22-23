package main;

public class WeatherConditionWorse implements WeatherCondition{

    Snail snail = new Snail();

    public void subidaAguaLLuvia(){
        snail.setProfundidadAgua(snail.getProfundidadAgua() - 5);
        System.out.println("Lueve fuertemente, el agua sube 5 metros");
    }
}

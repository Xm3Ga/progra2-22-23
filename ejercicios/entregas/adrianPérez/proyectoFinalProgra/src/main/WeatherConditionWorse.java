package main;

public class WeatherConditionWorse extends WeatherContitionAbstract {
    public void subidaAguaLLuvia(){
        setProfundidadAgua(getProfundidadAgua() - 5);
        System.out.println("Lueve fuertemente");
    }
}

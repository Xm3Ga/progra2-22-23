package main;

public class WeatherConditionWorse implements WeatherCondition{

    Snail snail = new Snail();

    public void rainwaterRise(){
        snail.setWaterDepth(snail.getWaterDepth() - 5);
        System.out.println("It rained a lot, the rainwater rose 5 meters during the day");
    }
}

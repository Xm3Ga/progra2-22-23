package main;

public class WeatherConditionBad implements WeatherCondition{

    Snail snail = new Snail();

    public void rainwaterRise(){
        snail.setWaterDepth(snail.getWaterDepth() - 2);
        System.out.println("It rained a little, the rainwater rose 2 meters during the day");
    }
}

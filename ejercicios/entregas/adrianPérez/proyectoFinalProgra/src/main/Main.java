package main;

public class Main {
    public static void main(String[] args){



        Snail snail = new Snail();
        WeatherConditionBad weatherConditionBad = new WeatherConditionBad();
        WeatherConditionWorse weatherConditionWorse = new WeatherConditionWorse();
        NormalClimbing normalClimbing = new NormalClimbing();
        FatiguedClimbing fatiguedClimbing = new FatiguedClimbing();
        ExhaustedClimbing exhaustedClimbing = new ExhaustedClimbing();
        CarEarthquake carEarthquake = new CarEarthquake();
        Draw draw = new Draw();

        boolean snailAlive = true;
 
        if (snail.getDay() == 0){
            snail.initialSnailDepth();
            }

        while (snailAlive){
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("                                                                     ");
            System.out.println("Day " + snail.getDay() + " out of 50");

            if(snail.getDay() > 10 && snail.getDay() <= 20){
                fatiguedClimbing.ascending();
                fatiguedClimbing.falling();
            }else if(snail.getDay() > 20 && snail.getDay() < 50){
                exhaustedClimbing.ascending();
                exhaustedClimbing.falling();
            }else if(snail.getDay() == 50){
                break;
            }else if (snail.getDay() != 0){
                normalClimbing.ascending();
                normalClimbing.falling();
            }     

            if (snail.getDay() != 0) {
                carEarthquake.carEarthquake();
            }

            double rainProbabilty = Math.floor(Math.random() * 101);
            if( rainProbabilty <= 5 && snail.getDay() != 0){
                weatherConditionWorse.rainwaterRise();
            }else if( (rainProbabilty >= 6 && rainProbabilty <= 15) && snail.getDay() != 0){
                weatherConditionBad.rainwaterRise();
            }


        System.out.println(" ");
        for(int i = 0; i <=20 ; i=i+1){
            if(i == 0){
                if(carEarthquake.isCar() == true){
                    carEarthquake.setCar(false);
                    System.out.println(draw.drawings[0]);

                }else{
                    System.out.println(draw.drawings[1]);
                }

            }else if (i >= snail.getWaterDepth()){
                System.out.println(draw.drawings[2]+ i);
            }else if (i == (int)snail.getSnailDepth()){
                System.out.println(draw.drawings[3] + i);
            }else{
                System.out.println(draw.drawings[4]+ i);
            }
            
        }    
        System.out.println(draw.drawings[5]);
        System.out.println();
        
        if (snail.getSnailDepth() > snail.getSnailDepthTemp()) {
            System.out.println("The snail has fallen " + (snail.getSnailDepth() - snail.getSnailDepthTemp()) + " metres");
            snail.setSnailDepthTemp(snail.getSnailDepth());
            System.out.println("\n");
        }
        else if (snail.getSnailDepth() < snail.getSnailDepthTemp()) {
            System.out.println("The snail has fallen " + (snail.getSnailDepthTemp() - snail.getSnailDepth()) + " metres");
            snail.setSnailDepthTemp(snail.getSnailDepth());
            System.out.println("\n");
        }
        else if (snail.getSnailDepth() == snail.getSnailDepthTemp() && snail.getDay() != 0){
            System.out.println("The snail has not moved");
            System.out.println("\n");
        }
        

        if ( snail.getSnailDepth() <= 0 || snail.getSnailDepth() >= snail.getWaterDepth() ){
            break;
        }

        if (snail.getDay() == 10) {
            System.out.println("The snail is tired, now it will only climb between 1 and 3 meters per day");
        }

        if (snail.getDay() == 20) {
            System.out.println("The snail is exhausted, now it will only climb between 1 and 2 meters per day");
        }

        snail.setDay(snail.getDay() + 1);   
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }

      
    if((int)snail.getSnailDepth() <= 0){
        System.out.println("The snail escaped in " + (snail.getDay()) + " days");
    }else if((int)snail.getSnailDepth() >= snail.getWaterDepth()){
        System.out.println("The snail drowned in " + (snail.getDay()) + " days");
    }else if(snail.getDay() == 50){
        System.out.println("The snail did not escape in 50 days");
    }

    }
}
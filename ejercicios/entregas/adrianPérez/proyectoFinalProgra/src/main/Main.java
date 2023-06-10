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

        boolean VidaCaracol = true;
 
        if (snail.getDia() == 0){
            snail.AlturaInicialCaracol();
            }

        while ( VidaCaracol ){

            if(snail.getDia() > 10 && snail.getDia() <= 20){
                fatiguedClimbing.ascending();
                fatiguedClimbing.falling();
            }else if(snail.getDia() > 20 && snail.getDia() < 50){
                exhaustedClimbing.ascending();
                exhaustedClimbing.falling();
            }else if(snail.getDia() == 50){
                break;
            }else if (snail.getDia() != 0){
                normalClimbing.ascending();
                normalClimbing.falling();
            }     

            if (snail.getDia() != 0) {
                carEarthquake.carEarthquake();
            }

            double probabilidadLluvia = Math.random() * 101;
            if( probabilidadLluvia <= 5 && snail.getDia() != 0){
                weatherConditionWorse.subidaAguaLLuvia();
            }else if( (probabilidadLluvia >= 6 && probabilidadLluvia <= 15) && snail.getDia() != 0){
                weatherConditionBad.subidaAguaLLuvia();
            }


        for(int i = 0; i <=20 ; i=i+1){
            if(i == 0){
                if(carEarthquake.isCar() == true){
                    carEarthquake.setCar(false);
                    System.out.println(draw.drawings[0]);

                }else{
                    System.out.println(draw.drawings[1]);
                }

            }else if (i >= snail.getProfundidadAgua()){
                System.out.println(draw.drawings[2]+ i);
            }else if(i == (int)snail.getProfundidadCaracol()){
                System.out.println(draw.drawings[3] + i);
            }else{
                System.out.println(draw.drawings[4]+ i);
            }
            
        }    
        System.out.println(draw.drawings[5]);
        System.out.println();
        
        if (snail.getProfundidadCaracol() > snail.getProfundidadCaracolTemp()) {
            System.out.println("El caracol ha bajado " + (snail.getProfundidadCaracol() - snail.getProfundidadCaracolTemp()) + " metros");
            snail.setProfundidadCaracolTemp(snail.getProfundidadCaracol());
            System.out.println("\n");
        }
        else if (snail.getProfundidadCaracol() < snail.getProfundidadCaracolTemp()) {
            System.out.println("El caracol ha subido " + (snail.getProfundidadCaracolTemp() - snail.getProfundidadCaracol()) + " metros");
            snail.setProfundidadCaracolTemp(snail.getProfundidadCaracol());
            System.out.println("\n");
        }
        else if (snail.getProfundidadCaracol() == snail.getProfundidadCaracolTemp() && snail.getDia() != 0){
            System.out.println("El caracol se ha mantenido en la misma altura");
            System.out.println("\n");
        }
        

        if ( snail.getProfundidadCaracol() <= 0 || snail.getProfundidadCaracol() >= snail.getProfundidadAgua() ){
            break;
        }

        snail.setDia(snail.getDia() + 1);   
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }

      
    if((int)snail.getProfundidadCaracol() <= 0){
        System.out.println("El caracol ha conseguido salir!!!!");
    }else if((int)snail.getProfundidadCaracol() >= snail.getProfundidadAgua()){
        System.out.println("El caracol se ahogó intentando salir en el dia() " + (snail.getDia()));
    }else if(snail.getDia() == 50){
        System.out.println("El caracol murió de inanicion tras luchar 50 dias");
    }

    }
}
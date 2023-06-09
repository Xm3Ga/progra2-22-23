package main;

public class Main {
    public static void main(String[] args){

        WeatherConditionBad weatherConditionBad = new WeatherConditionBad();
        WeatherConditionWorse weatherConditionWorse = new WeatherConditionWorse();
        NormalClimbing normalClimbing = new NormalClimbing();
        FatiguedClimbing fatiguedClimbing = new FatiguedClimbing();
        ExhaustedClimbing exhaustedClimbing = new ExhaustedClimbing();
        CarEarthquake carEarthquake = new CarEarthquake();
        Snail snail = new Snail();

        boolean VidaCaracol = true;
        boolean coche = false;
        double profundidadCaracolInicial = (Math.random()*10)+10;
        double profundidadCaracol = Math.round(profundidadCaracolInicial*100)/100;
        profundidadCaracolInicial = Math.round(profundidadCaracolInicial*100)/100;
        int dia = 0;
 


        while ( VidaCaracol ){

            if(dia > 10 && dia <= 20){
                fatiguedClimbing.ascending();
                fatiguedClimbing.falling();
            }else if(dia > 20 && dia < 50){
                exhaustedClimbing.ascending();
                exhaustedClimbing.falling();
            }else if(dia == 50){
                break;
            }else{
                normalClimbing.ascending();
                normalClimbing.falling();
            }     

            carEarthquake.carEarthquake();

            double probabilidadLluvia = Math.random();
            if( probabilidadLluvia <= 0.05 ){
                weatherConditionWorse.subidaAguaLLuvia();
            }else if( probabilidadLluvia >= 0.9 ){
                weatherConditionBad.subidaAguaLLuvia();
            }


        System.out.println("Dia [" + dia + "]  /  Punto de inico: [" + profundidadCaracolInicial + "]  /  Altura al final del dia: [-" + profundidadCaracol + "] ");
        for(int i = 0; i <=20 ; i=i+1){
            if(i == 0){
                if(coche){
                    coche = false;
                    System.out.println("[__]    O-=-O     [__]");

                }else{
                    System.out.println("[__]              [__]");
                }

            }else if (i >= snail.getProfundidadAgua()){
                System.out.println("  []~~~~~~~~~~~~~~[] _ __ "+ i);
            }else if(i == (int)profundidadCaracol){
                System.out.println("  []    _@)_/’    [] _ __ "+ i);
            }else{
                System.out.println("  []:. :. :. :. :.[] _ __ "+ i);
            }
        }    
        System.out.println("  [][][][][][][][][] ");
        System.out.println();
        System.out.println();

        if ( profundidadCaracol <= 0 || profundidadCaracol >= snail.getProfundidadAgua() ){
            break;
        }

        }
    if((int)profundidadCaracol <= 0){
        System.out.println("El caracol ha conseguido salir!!!!");
    }else if((int)profundidadCaracol >= snail.getProfundidadAgua()){
        System.out.println("El caracol se ahogo intentando salir en el dia " + (dia-1));
    }else if(dia == 50){
        System.out.println("El caracol murio de inanicion tras luchar 50 dias");
}
}
}
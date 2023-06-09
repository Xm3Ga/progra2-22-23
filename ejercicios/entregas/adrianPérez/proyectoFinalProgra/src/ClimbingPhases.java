public interface ClimbingPhases {

    public double subida();

    public static double caida(){
        double caida = (Math.random()*2);
        return Math.round(caida*100.00)/100.00;
    }

}
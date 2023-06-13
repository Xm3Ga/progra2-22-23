package main;

public abstract class AbstractSnail {
    
    static double waterDepth = 20;
    static int snailDepth = 0;
    static int snailDepthTemp = 0;
    static int day = 0;

    abstract int getDay();
    abstract void setDay(int dia);
    abstract double getSnailDepth();
    abstract void setSnailDepth(double snailDepth);
    abstract double getSnailDepthTemp();
    abstract void setSnailDepthTemp(double setSnailDepthTemp);
    abstract double getWaterDepth();
    abstract void setWaterDepth(double profundidadAgua);
    abstract int initialSnailDepth();
}

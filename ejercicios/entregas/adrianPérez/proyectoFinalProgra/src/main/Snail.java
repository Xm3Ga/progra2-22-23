package main;

public class Snail extends AbstractSnail{
    
    public Snail() {
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        AbstractSnail.day = day;
    }

    public double getSnailDepth() {
        return snailDepth;
    }

    public void setSnailDepth(double snailDepth) {
        AbstractSnail.snailDepth = (int) snailDepth;
    }

    public double getSnailDepthTemp() {
        return snailDepthTemp;
    }

    public void setSnailDepthTemp(double snailDepthTemp) {
        AbstractSnail.snailDepthTemp = (int) snailDepthTemp;
    }

    public double getWaterDepth() {
        return waterDepth;
    }
    
    public void setWaterDepth(double waterDepth) {
        AbstractSnail.waterDepth = waterDepth;
    }

    public int initialSnailDepth() {
        int initialDepth = (int) Math.floor(Math.random() * 11) + 10;
        snailDepth = initialDepth;
        snailDepthTemp = initialDepth;
        return initialDepth;
    }
}

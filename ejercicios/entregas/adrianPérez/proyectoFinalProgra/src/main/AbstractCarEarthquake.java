package main;

public abstract class AbstractCarEarthquake {

    protected boolean car = false;

    abstract public boolean isCar();

    abstract public void setCar(boolean car);

    abstract public void carEarthquake();
  
}
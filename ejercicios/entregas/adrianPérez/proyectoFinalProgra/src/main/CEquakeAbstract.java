package main;

public abstract class CEquakeAbstract {

    Snail snail = new Snail();

    protected boolean car = false;

    public boolean isCar() {
        return car;
    }
    public void setCar(boolean car) {
        this.car = car;
    }
  
}
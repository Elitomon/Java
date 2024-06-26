package edu.cscc;

public class WaterTank {
    private int current;
    private int maxCap;

    // Constructor
    public WaterTank(int current, int maxCap) {
        this.current = current;
        this.maxCap = maxCap;

        if (current > maxCap) {
            this.current = maxCap;
        }
    }

    //getters
    public int getCurrent() {
        return current;
    }

    public int getMaxCap() {
        return maxCap;
    }

    public void add(int volume) {
        current = current + volume;
        if (current > maxCap){
            current = maxCap;
        }

    }

    public void drain(int volume) {
        current = current - volume;

        if (current < 0){
            current = 0;
        }

    }

    public void print() {
        System.out.println("the current volume of the tank is: " + current + " gallons");
    }

}


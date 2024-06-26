package edu.cscc;

public class ElectricCar extends Car{
    private int batterySize;


    // Constructor

    public ElectricCar(String make, String model, int year, int batterySize) {
        super(make, model, year);
        this.batterySize = batterySize;
    }

    // getters, setters

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    // Other Methods
    @Override
    public void describe() {
        super.describe();
        System.out.println("Battery Size: " +this.batterySize);
    }
}

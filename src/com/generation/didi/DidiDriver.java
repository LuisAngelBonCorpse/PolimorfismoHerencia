package com.generation.didi;

public class DidiDriver {
    private String name;
    private String carModel;
    private String plate;
    private int minimum;
    private double ratePerKm;
    private int ratePerMinute;
    private int currentMonthSalary;

    public DidiDriver(String name, String carModel, String plate){
        this.name = name;
        this.carModel = carModel;
        this.plate = plate;
        minimum = 7;
        ratePerKm = 1.5;
        ratePerMinute = 1;
        currentMonthSalary = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    public int getRatePerMinute() {
        return ratePerMinute;
    }

    public void setRatePerMinute(int ratePerMinute) {
        this.ratePerMinute = ratePerMinute;
    }

    public int getCurrentMonthSalary() {
        return currentMonthSalary;
    }

    public void setCurrentMonthSalary(int currentMonthSalary) {
        this.currentMonthSalary = currentMonthSalary;
    }

    public double calculatePriceDistance(double km) {
        return Math.max(ratePerKm*km,minimum);
    }

    public double calculatePriceTime(int minute) {
        return Math.max(ratePerMinute*minute,minimum);
    }
}

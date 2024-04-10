package com.softtek.modelo.ejercicio2;

public class Stats {
    private double min;
    private double max;
    private double mean;

    public Stats(double min, double max, double mean) {
        this.min = min;
        this.max = max;
        this.mean = mean;
    }


    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public double getMean() {
        return mean;
    }

    public String toString() {
        return "Stats [min=" + min + ", max=" + max + ", mean=" + mean + "]";
    }
}

package com.softtek.modelo.ejercicio2;

import java.util.List;

public class StatsCalculator {

    public static Stats calculateStats(List<Double> numbers) {
        double min = numbers.stream().mapToDouble(Double::doubleValue).min().orElse(Double.NaN);
        double max = numbers.stream().mapToDouble(Double::doubleValue).max().orElse(Double.NaN);
        double sum = numbers.stream().mapToDouble(Double::doubleValue).sum();
        double mean = numbers.isEmpty() ? Double.NaN : sum / numbers.size();

        return new Stats(min, max, mean);
    }
}

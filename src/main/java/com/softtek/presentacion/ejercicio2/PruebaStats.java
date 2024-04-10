package com.softtek.presentacion.ejercicio2;

import com.softtek.modelo.ejercicio2.Stats;
import com.softtek.modelo.ejercicio2.StatsCalculator;
import java.util.List;

public class PruebaStats {

    public static void main(String[] args) {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);

        Stats stats = StatsCalculator.calculateStats(numbers);
        System.out.println(stats);
    }
}

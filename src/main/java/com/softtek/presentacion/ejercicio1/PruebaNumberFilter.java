package com.softtek.presentacion.ejercicio1;

import com.softtek.modelo.ejercicio1.NumberFilter;
import java.util.ArrayList;
import java.util.List;

public class PruebaNumberFilter {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        List<Integer> evenNumbers = NumberFilter.filterEvenNumbers(numbers);
        System.out.println("Lista de números pares: " + evenNumbers);
    }
}

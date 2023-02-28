package com.example;

import java.util.ArrayList;
import java.util.List;
public class ListMain {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();

        nombres.add("Donald");
        nombres.add("Hugo");
        nombres.add("Paco");
        nombres.add("Luis");

        System.out.println(nombres);

        for(String nombre: nombres) {
            System.out.println(nombre);
        }
    }
}

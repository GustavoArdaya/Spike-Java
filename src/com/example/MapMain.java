package com.example;

import java.util.HashMap;
import java.util.Map;
public class MapMain {

    public static void main(String[] args) {


        Map<String, String> personas = new HashMap<>();

        personas.put("4514525234", "Juan Perez");
        personas.put("4514249857", "Ana Perez");
        personas.put("5123455234", "Jose Perez");
        personas.put("2459387459", "Maria Perez");

        for (String key : personas.keySet()) {
            System.out.println(key);
        }

        for (String values : personas.values()) {
            System.out.println(values);
        }

        for (Map.Entry<String, String> pair : personas.entrySet()) {
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }
    }
}

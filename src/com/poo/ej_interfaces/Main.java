package com.poo.ej_interfaces;

public class Main {

    public static void main(String[] args) {

        CocheCRUD coche = new CocheCRUDImpl();

        coche.findAll();
        coche.delete();
        coche.save();
    }
}

package com.examples.ejemploliskov.mal;

public class Ninyo extends Persona{

    public Ninyo(String nombre, String apellidos) {
        super(null, nombre, apellidos, null);
    }
    @Override
    public void pagar() {
        throw new RuntimeException("un niño no puede pagar");
    }
}

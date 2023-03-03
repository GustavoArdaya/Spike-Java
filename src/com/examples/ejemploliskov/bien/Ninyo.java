package com.examples.ejemploliskov.bien;

public class Ninyo extends Persona {
    private Adulto tutor;

    public Ninyo(String nombre, String apellidos,
                 Adulto tutor) {
        super(nombre, apellidos);
        this.tutor = tutor;
    }
}

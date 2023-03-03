package com.examples.ejemploliskov.bien;

public class Adulto extends Persona {

    private String dni;
    private String tarjeta;
    public Adulto(String nombre, String apellidos,
                  String dni, String tarjeta) {
        super(nombre, apellidos);
        this.dni = dni;
        this.tarjeta = tarjeta;
    }
    public void pagar() {
        System.out.println("mi dni es " + this.dni +
                "pago con la tarjeta" + this.tarjeta);
    }
}

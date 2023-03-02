package com.poo.herencia;

import com.poo.clases.SmartDevice;

public class SmartPhone extends SmartDevice {

    String redMovil;
    double megaPixeles;

    public SmartPhone(String modelo, String modeloProcesador, double velProcesador, int ram, int almacenamiento, double displaySize, String redMovil, double megaPixeles) {
        super(modelo, modeloProcesador, velProcesador, ram, almacenamiento, displaySize);
        this.redMovil = redMovil;
        this.megaPixeles = megaPixeles;
    }

    public SmartPhone(){

    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "redMovil='" + redMovil + '\'' +
                ", megaPixeles=" + megaPixeles +
                ", modelo='" + modelo + '\'' +
                ", modeloProcesador='" + modeloProcesador + '\'' +
                ", velProcesador=" + velProcesador +
                ", ram=" + ram +
                ", almacenamiento=" + almacenamiento +
                ", displaySize=" + displaySize +
                '}';
    }
}

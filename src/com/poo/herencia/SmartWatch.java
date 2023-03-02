package com.poo.herencia;

import com.poo.clases.SmartDevice;

public class SmartWatch extends SmartDevice {

    double tamañoEsfera;

    public SmartWatch(String modelo, String modeloProcesador, double velProcesador, int ram, int almacenamiento, double displaySize, double tamañoEsfera) {
        super(modelo, modeloProcesador, velProcesador, ram, almacenamiento, displaySize);
        this.tamañoEsfera = tamañoEsfera;
    }

    public SmartWatch() {

    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "tamañoEsfera=" + tamañoEsfera +
                ", modelo='" + modelo + '\'' +
                ", modeloProcesador='" + modeloProcesador + '\'' +
                ", velProcesador=" + velProcesador +
                ", ram=" + ram +
                ", almacenamiento=" + almacenamiento +
                ", displaySize=" + displaySize +
                '}';
    }
}

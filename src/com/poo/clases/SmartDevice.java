package com.poo.clases;

public abstract class SmartDevice {

    protected String modelo;
    protected String modeloProcesador;
    protected double velProcesador;
    protected int ram;
    protected int almacenamiento;
    protected double displaySize;

    public SmartDevice(String modelo, String modeloProcesador, double velProcesador, int ram, int almacenamiento, double displaySize) {
        this.modelo = modelo;
        this.modeloProcesador = modeloProcesador;
        this.velProcesador = velProcesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.displaySize = displaySize;
    }

    public SmartDevice() {

    }
}

package com.example;

public class CalculoDeIVA {
    public static void main(String[] args) {
        double valor = 84.99;
        System.out.println("El precio total de un producto que vale " + valor + " mas IVA es de " + calcular(valor) + ".");
    }

    static public double calcular(double valor) {
        return valor * 1.21;
    }
}

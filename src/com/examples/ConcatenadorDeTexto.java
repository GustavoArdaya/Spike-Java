package com.examples;

public class ConcatenadorDeTexto {
    public static void main(String[] args) {

        String[] nombres = {"Jose", "Maria", "Jesus", "Espíritu Santo"};
        String resultado = "";

        for (int i = 0; i < nombres.length; i++) {
            resultado += nombres[i] + " ";
        };

        System.out.println(resultado);
    }


}

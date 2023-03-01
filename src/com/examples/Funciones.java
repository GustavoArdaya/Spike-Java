package com.examples;

public class Funciones {

    public static void main(String[] args) {
        holaMundo();
        //No olvidarse ejecutar dentro de main!
        saludador("Bigotes");
        saludoMalcriado();

        System.out.println("El resultado de la funcion suma es " + suma(1, 2) + ".");
    }

    private static void holaMundo() {
        //esta funcion deberia imprimir hola mundo. El comando es System.out.println
        System.out.println("Hola Domun x 2");
    }

    private static void saludador(String name) {
        System.out.println("Hola Mr. " + name + ". Comment allez vous?");
    }

    private static void saludoMalcriado() {
        //este no recibe parámetros
        System.out.println("Hola, como te llames");
    }

    //funcion con parámetros que devuelve valor:

    public static int suma(int a, int b) {
        return a + b;
    }


}

package com.fundaula.clasegenerica;

public class OperacionesMain {
    public static void main(String[] args) {

        Operaciones<Integer> op1 = new Operaciones<Integer>();

        int primero = 10;
        int segundo = 4;

        System.out.println("Primero con enteros");

        System.out.println("La suma de " + primero + " y " + segundo + " es: " + op1.suma(primero, segundo));
        System.out.println("La resta de " + primero + " y " + segundo + " es: " + op1.resta(primero, segundo));
        System.out.println("La multiplicacion de " + primero + " por " + segundo + " es: " + op1.multiplicacion(primero, segundo));
        System.out.println("La division de " + primero + " entre " + segundo + " es: " + op1.division(primero, segundo));

        Operaciones<Double> op2 = new Operaciones<Double>();

        double primero2 = 8.5;
        double segundo2 = 2.7;

        System.out.println("Ahora con doubles");

        System.out.println("La suma de " + primero2 + " y " + segundo2 + " es: " + op2.suma(primero2, segundo2));
        System.out.println("La resta de " + primero2 + " y " + segundo2 + " es: " + op2.resta(primero2, segundo2));
        System.out.println("La multiplicacion de " + primero2 + " por " + segundo2 + " es: " + op2.multiplicacion(primero2, segundo2));
        System.out.println("La division de " + primero2 + " entre " + segundo2 + " es: " + op2.division(primero2, segundo2));

    }


}

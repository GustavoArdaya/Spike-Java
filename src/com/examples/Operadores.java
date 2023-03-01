package com.examples;

public class Operadores {
    // aritméticos
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 30;

        int resultadoSuma = numero1 + numero2;
        int resultadoResta = numero1 - numero2;
        int resultadoMultiplicacion = numero1 * numero2;
        int resultadoDivision = numero1 / numero2;

        System.out.println("El resultado de la suma es: " + resultadoSuma);
        System.out.println("El resultado de la resta es: " + resultadoResta);
        System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicacion);
        System.out.println("El resultado de la division es: " + resultadoDivision);

        if (numero2 > numero1) {
            System.out.println("El numero " + numero2 + " es mas alto que " + numero1);
        }

        int aumentado = numero1++; //deberia incrementar valor de numero1 en 1. Entonces = 11;
        int reducido = numero2 --; //deberia reducir valor de numero2 en 1. Entonces = 29;

        System.out.println("despues de incrementar el primer numero: " + numero1 + ". Y despues de reducir el segundo numero: " + numero2);
    }
    int numero1 = 10;
    int numero2 = 30;

    int resultadoSuma = numero1 + numero2;

    //Lógicos

    /*

     */

    //incremento y decremento =


}

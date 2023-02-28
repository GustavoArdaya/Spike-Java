package com.example;

public class MetodosString {
    public static void main(String[] args) {
        //utilizaremos:

        /*
        1. Length()
        2. startsWith(String)
        3. endsWith(String)
        4. indexOf(String)
        5. subString(1,5)
        6. trim()
        7. equals(String)
        8. compareTo(String)
         */
        String mensaje = "Hello World";

        System.out.println(mensaje.length());
        String mensajeMay = mensaje.toUpperCase();
        System.out.println(mensajeMay);

        String mensajeATrimear = " Hello World ";
        System.out.println(mensajeATrimear.trim());
        System.out.println(mensajeATrimear);

        if ((mensajeATrimear.trim()).equals(mensaje)) {
            System.out.println("Si son iguales!");
        }
    }

}

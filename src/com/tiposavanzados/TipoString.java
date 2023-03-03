package com.tiposavanzados;

public class TipoString {
    public static void main(String[] args) {

        // Unos cuantos ejercicios sobre metodos de tipo String:

        String cadena = "Texto de Ejemplo";

        int cadenaLength = cadena.length();
        System.out.println("Mediante el metodo length extraigo la longitud de caracteres de cadena, que es :" + cadenaLength);

        // Para mayusculas y minusculas:

        String cadenaMayuscula = cadena.toUpperCase();
        System.out.println("Mediante el metodo toUpperCase extraigo las mayusculas de cadena, que es :" + cadenaMayuscula);

        String cadenaMinuscula = cadena.toLowerCase();
        System.out.println("Mediante el metodo toLowerCase extraigo las minusculas de cadena, que es :" + cadenaMinuscula);

        //Metodos para verificar si un string empieza o termina con una substring:

        boolean resultadoStarts = cadena.startsWith("Tex"); // si cambio la primera letra por minuscula, dara falso (Es case sensitive)
        if (resultadoStarts) {
            System.out.println("Empieza con Tex");
        } else {
            System.out.println("No Empieza con Tex");
        }

        if (cadena.endsWith("plo")) { //Esta vez sin declarar una variable:
            System.out.println("Termina con plo");
        } else {
            System.out.println("No termina con plo");
        }

        //CharAt, sirve para buscar el caracter en el indice de un string:

        char letra = cadena.charAt(2);
        System.out.println("La letra 2 es: " + letra + " (Se empieza a contar desde 0)");

        // Para recorrer un string se utiliza un bucle for y el metodo charAt:

        for (int i = 0; i < cadena.length(); i++) {
            char letraActual = cadena.charAt(i);
            System.out.println("La letra " + i + " es: " + letraActual);
        }

        // Ejercicio para "darle la vuelta" a cadena:

        String cadenaAlReves = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaAlReves += cadena.charAt(i);
        }
        System.out.println("La cadena al reves es: " + cadenaAlReves);



    }
}

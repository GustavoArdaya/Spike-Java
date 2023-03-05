package com.entradasalida;

import java.io.*;


public class InputStreamExample {
    public static void main(String[] args) {
        try {
            InputStream fichero = new FileInputStream("C:/Users/gusta/Dropbox/Mi PC (LAPTOP-T710QH4E)/Desktop/Factoria-F5/Spike_Java/java_spike/src/com/entradasalida/ejemplo.txt");
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);
            try {

                //Con bytes: (mas lento, para files pequeños)
//                byte[] datos = fichero.readAllBytes();
//
//                for (byte dato : datos) {
//                    System.out.print((char)dato);
//                }

                // con entero y bucle while (para files mas grandes)

//                int datos2 = fichero.read();
//                while (datos2!= -1) {
//                    // -1 es EOF (end of file)
//                    System.out.print((char)datos2);
//                    datos2 = fichero.read();
                //}

                // por "trozos", bucle while y toString() con bufferedInputStream;

                //byte datos3[] = new byte[5]; //trozos de 5
                int datos4 = ficheroBuffer.read();
                while (datos4!= -1) {
                    System.out.print((char)datos4);
                    datos4 = ficheroBuffer.read();
                }

            } catch (IOException e) {
                System.out.println("Error leyendo fichero: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

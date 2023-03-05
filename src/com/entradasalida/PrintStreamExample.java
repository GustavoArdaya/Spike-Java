package com.entradasalida;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;

public class PrintStreamExample {

    public static void main(String[] args) {
        try {
            InputStream in = new FileInputStream("C:/Users/gusta/Dropbox/Mi PC (LAPTOP-T710QH4E)/Desktop/Factoria-F5/Spike_Java/java_spike/src/com/entradasalida/ejemplo.txt");
            byte [] datos = in.readAllBytes();

            PrintStream out = new PrintStream("destino.txt");
            out.write(datos);
        } catch (Exception e) {
            System.out.println("Exception = " + e.getMessage());
        }
    }
}

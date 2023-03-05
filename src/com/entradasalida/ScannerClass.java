package com.entradasalida;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        boolean ok = false;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduzca dos numeros: ");
            //scanner.reset();
        try {

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println("Los enteros son: " + a + " y " + b);
            ok = true;
        } catch (InputMismatchException e) {
            System.out.println("Numeros no válidos");
        }
        } while (!ok);
    }
}

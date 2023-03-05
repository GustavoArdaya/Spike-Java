package com.exercicios789;

import org.w3c.dom.ls.LSOutput;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        //1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        String[] uniDimensional = {"Perro", "Gato", "Leon", "Aguila", "Raton"};
        for (String animal : uniDimensional) {
            System.out.println(animal);
        }

        //2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
        int[][] biDimensional = {{1, 2, 3}, {4, 5, 6},{7,8,9}};

        for (int i = 0; i < biDimensional.length; i++) {
            for (int j = 0; j < biDimensional[i].length; j++) {
                System.out.println("En fila " + i + ", columnaa " + j + " = " + biDimensional[i][j]);
            }
        }

    // 3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.

        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.remove(1);
        vector.remove(1); // se repite el indice 1 porque vector se actualiza;

        System.out.println(vector);

        // 4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
        // R. El problema seria que al tener una capacidad por defecto si se supera el número máximo el vector se copia en un nuevo vector. El gasto
        // a nivel de procesamiento es demasiado.

        // 5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.

        String[] lista = {"Rojo", "Amarillo", "Verde", "Negro"};
        LinkedList<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.addAll(List.of(lista));

        System.out.println("Elementos de lista original:");
        for (String color : listaLinkedList) {
            System.out.println(color);
        }
        System.out.println("Elementos de lista con LinkedList:"); // debe usar size() para el tamaño y get() para obtener el elemento
        for (int i = 0; i < listaLinkedList.size(); i++) {
            System.out.println(listaLinkedList.get(i));
        }

        // 6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

        ArrayList <Integer> listaInt = new ArrayList<>(10);
        for (int i = 1; i <= 10; i++) {
            listaInt.add(i);
            }

        System.out.println(listaInt);
        for (int i = 0; i < listaInt.size(); i++) {
            if (listaInt.get(i) % 2 == 0) {
                listaInt.remove(i);
            }
        }
        for (int i = 0; i < listaInt.size(); i++) {
            System.out.println(listaInt.get(i));
        }
        System.out.println(listaInt);


        System.out.println(DividePorCero(4,0)); // llamado a funcion de n. 7


        }

        // 7. Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".


    public static int DividePorCero(int dividendo, int divisor) throws ArithmeticException {
        try {
            return dividendo / divisor;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
    }
    public static void copiadorDeArchivos(InputStream fileIn, PrintStream fileOut) {
        try {
            //InputStream in = new FileInputStream("C:/Users/gusta/Dropbox/Mi PC (LAPTOP-T710QH4E)/Desktop/Factoria-F5/Spike_Java/java_spike/src/com/entradasalida/ejemplo.txt");
            InputStream in = fileIn;
            byte [] datos = in.readAllBytes();
            in.close();

            //PrintStream out = new PrintStream("destino.txt");
            PrintStream out = fileOut;
            out.write(datos);
            out.close();

        } catch (Exception e) {
            System.out.println("Exception = " + e.getMessage());
        }
    }

    }


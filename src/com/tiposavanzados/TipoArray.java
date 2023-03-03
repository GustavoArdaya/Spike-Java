package com.tiposavanzados;

public class TipoArray {

    public static void main(String[] args) {

        //Para declarar un array:

        // 1 .- <Tipo de datos> <Nombre de array>[] = new int[<numero de elementos>];

        int[] arrayDeEnteros = new int[5]; // los rellena con 5 ceros.

        // los puedo rellenar manualmente:

        arrayDeEnteros[0] = 10;
        arrayDeEnteros[1] = 20;
        arrayDeEnteros[2] = 30;
        arrayDeEnteros[3] = 40;
        arrayDeEnteros[4] = 50;

        //Si hago un System.out.println(arrayDeEnteros) solo me mostrara la dirección de memoria.

        for (int i = 0; i < arrayDeEnteros.length; i++) { // de esta forma se imprime los 5 elementos en la terminal
            System.out.print(arrayDeEnteros[i] + " "); // println imprime en nuevas lineas, mientras que print en la misma linea
        }

        // 2. <Tipo de datos> <Nombre de array> = { 1, 2, 3, 4, 5 }; De esta manera se declara los
        // valores de inicio.
        System.out.println("\n");
        String[] arrayDeStrings = {"Donald", "Hugo", "Paco", "Luis"};

        for (int i = 0; i < arrayDeStrings.length; i++) {
            System.out.print(arrayDeStrings[i] + " ");
        }
        System.out.println("\n");
        // Otro metodo de recorrer un array:

        // ForEach

        for (String nombre : arrayDeStrings) {
            System.out.println("Nombre actual: " + nombre);
        }

        // La ventaja de usar un for normal es que se puede utilizar su indice:

        for (int i = 0; i < arrayDeStrings.length; i++) {
            System.out.println("Nombre numero " + (i+1) + ": " + arrayDeStrings[i]);
        }

        // Arrays bidimensionales:

        int[][] arrayBidimensional = new int[2][3];

        arrayBidimensional[0][0] = 10;
        arrayBidimensional[0][1] = 20;
        arrayBidimensional[0][2] = 30;

        arrayBidimensional[1][0] = 40;
        arrayBidimensional[1][1] = 50;
        arrayBidimensional[1][2] = 60;

        // Los loops para recorrerlos son anidados:

        for (int i = 0; i < arrayBidimensional.length; i++) { // se itera sobre length que es el numero de filas (gran dimension)
            for (int j = 0; j < arrayBidimensional[i].length; j++) { // iterara sobre el length de cada elemento de la filas, dando el numero de columnas
                System.out.println("En fila " + i + " y columna " + j + " está el elemento: " + arrayBidimensional[i][j] + ".");
            }
            System.out.println();
        }

        System.out.println("Esquemáticamente:" + "\n");

        for (int i = 0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j < arrayBidimensional[i].length; j++) {
                System.out.print(arrayBidimensional[i][j] + " ");
            }
            System.out.println();
        }

    }
}

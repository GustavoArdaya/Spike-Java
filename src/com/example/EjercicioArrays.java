package com.example;

public class EjercicioArrays {
    public static void main(String[] args) {
        int[] notas = new int[10];
        int[] notas2 = {10, 8, 7, 4, 5, 6, 9, 8};

        for (int i = 0; i < notas2.length; i++) {
            System.out.println(notas2[i]);
        }

        for (int item:notas2) {
            System.out.println(item);
        }
       /* notas2.binarySearch(notas2, 9);
        notas2.sort(notas2); */
    }
}

package com.examples;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Soy un niño grande y se contar hasta 10: \n");
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                System.out.print(i+1);
            } else if (i < 9 && i > 0) {
                System.out.print(", " + (i+1));
            } else {
                System.out.println(" y " + (i+1));
            }
        }
    }
}

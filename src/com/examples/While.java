package com.examples;

public class While {
    public static void main(String[] args) {
        int nivelDeComida = 0;
        while (nivelDeComida < 10) {
            nivelDeComida++;
            if (nivelDeComida == 5) {

                System.out.println("Creo que le regalaré mi bocadillo " + nivelDeComida + " a mi perro.");
                continue;
            } else if (nivelDeComida == 9){
                System.out.println("Ay no! ya no puedo mas! no podre terminar los bocadillos.");
                break;
            }
            System.out.println("Que hambre, me como mi bocadillo " + (nivelDeComida));


        }
        System.out.println("Ahora si, a dormir la siesta");
    }


}

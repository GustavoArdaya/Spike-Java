package com.tiposavanzados;

import java.util.ArrayList;

public class TipoArrayList {
    public static void main(String[] args) {

        //Arraylists mas pequeños que vector
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");

        System.out.println("Los elementos de la lista son: " + lista);

        System.out.println("remove elimina por contenido o por indice");
        lista.remove("Elemento 2");
        System.out.println("Despues de lista.remove('Elemento 2'): " + lista);

    }
}

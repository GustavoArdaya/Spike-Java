package com.tiposavanzados;

import java.util.HashMap;
import java.util.Map;

public class TipoMapa {
    public static void main(String[] args) {

        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("Clave 1", 10);
        mapa.put("Clave 2", 20);
        mapa.put("Clave 3", 30);

        System.out.println(mapa);
        System.out.println("Valor de Clave 1 = " + mapa.get("Clave 1"));

        //Para cambiar valores: metodo replace();
        mapa.replace("Clave 1", 15);
        System.out.println("Despues de reemplazar valor = " + mapa);

        //Se elimina con remove y llave en el parametro

        //Para iterar sobre mapa se puede utilizar Map.Entry con getKey() y getValue():

        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}

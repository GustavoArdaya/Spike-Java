package com.tiposavanzados;

import java.util.Vector;

public class TipoVectores {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        vector.add(1);
        vector.add(2);
        vector.add(3);

        System.out.println("Datos del vector: " + vector);

        vector.remove(2);
        System.out.println("Datos del vector despues de eliminar indice 2 (el tercer elemento): " + vector);

        System.out.println("Mediante .size() se obtiene la 'longitud': " + vector.size());
        System.out.println("Mediante .capacity se obtiene la 'capacidad': " + vector.capacity());

        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);
        vector.add(11);
        vector.add(12);
        vector.add(13);

        System.out.println("Despues de añadir mas elementos que superan la capacidad inicial, la nueva longitud es: "
                + vector.size() + " y la nueva capacidad es: " + vector.capacity());

        //computacionalmente la ampliacion del vector es muy costoso a nivel de procesamiento, ya que debe crear, copiar
        // y eliminar. Se puede regular la capacidad inicial en el primer parametro y el incremento en el segundo.

        Vector<Integer> vector2 = new Vector<>(10, 5); //este vector tiene una capacidad inicial
        //de 10 y aumentara de 5 en 5 cada vez que supere su limite de tamaño. Aunque se eliminen elementos la capacidad no
        //disminuye de tamaño. Hay que hacerlo manualmente mediante el metodo trimToSize().

        vector2.add(1);
        vector2.add(2);
        vector2.add(3);

        // Para comparar metodo equals() devuelve verdadero si dos vectores son iguales.

        System.out.println("Son ambos vectores iguales? " + vector.equals(vector2));

        // Los vectores pueden ser recorridos mediante for (no olvidarse usar size() en lugar de length) y foreach
        // utilizando el metodo get() para obtener los elementos del vector.

    }
}

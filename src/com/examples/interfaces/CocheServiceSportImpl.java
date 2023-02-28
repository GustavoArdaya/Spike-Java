package com.examples.interfaces;
import com.examples.Coche;
import com.examples.CocheElectrico;

public class CocheServiceSportImpl implements CocheService {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creación de coche de carreras");
        return new CocheElectrico();
    }
}

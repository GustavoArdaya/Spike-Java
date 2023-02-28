package com.examples.interfaces;
import com.examples.Coche;
import com.examples.CocheElectrico;

public class CocheServiceClassicImpl implements CocheService {
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creación de coche clásico");
        return new CocheElectrico();
    }
}

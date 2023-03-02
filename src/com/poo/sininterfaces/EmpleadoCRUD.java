package com.poo.sininterfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD {

    static List<Empleado> empleados = new ArrayList<>();

    //Operaciones CRUD

    // Guardar empleado
    public static void guardar(Empleado empleado) {
        empleados.add(empleado);
    }

    public static List<Empleado> findAll(){
        return empleados;
    }
}

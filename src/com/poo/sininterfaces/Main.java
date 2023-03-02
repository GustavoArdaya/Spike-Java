package com.poo.sininterfaces;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

        Empleado jose = new Empleado("Jose", 30, 40000,true);
        Empleado maria = new Empleado("Maria", 25, 40000,true);
        Empleado tomas = new Empleado("Tomás", 40, 45000,true);

        //Guardar empleados
        EmpleadoCRUD.guardar(jose);
        EmpleadoCRUD.guardar(maria);
        EmpleadoCRUD.guardar(tomas);

        //consultar empleados
        List<Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);
    }
}

package com.poo.ej_interfaces;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("soy el método save");
    }

    @Override
    public void findAll() {
        System.out.println("soy el método findAll");
    }

    @Override
    public void delete() {
        System.out.println("soy el método delete");
    }
}

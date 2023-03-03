package com.fundaula.clasegenerica;

public class Operaciones <N extends Number> {

    double suma(N n1, N n2){
        return n1.doubleValue() + n2.doubleValue();
    }
    double resta(N n1, N n2){
        return n1.doubleValue() - n2.doubleValue();
    }
    double multiplicacion(N n1, N n2){
        return n1.doubleValue() * n2.doubleValue();
    }
    double division(N n1, N n2){
        return n1.doubleValue() / n2.doubleValue();
    }
}

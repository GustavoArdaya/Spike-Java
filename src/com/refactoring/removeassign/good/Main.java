package com.refactoring.removeassign.good;


import com.refactoring.removeassign.bad.Order;

public class Main {


    double calculateDiscount(Order order, double totalPrice){

        //creando nueva variable se evita reasignar la variable que se ingreso en los parametros
        double result = totalPrice;

        if (order == null || order.getPrice() == null)  // programacion defensiva
            return result;

        if (order.getPrice() > 100)
            result += order.getPrice() * order.getOffer(); // sobreescribe totalPrice
        return result;
    }
}

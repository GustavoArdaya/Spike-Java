package com.refactoring.extractvariable.good;

public class Main {

    void printProductPrice(Order order){

        // Precio de productos
        Double quantityPrice = order.getPrice() * order.getQuantity();

        // Descuento
        Double discountPrice = order.getPrice() * order.getOffer();

        // Calculo de precio de productos con descuento incluido.

        Double finalPrice = quantityPrice - discountPrice;

        // precio de envio
        Double shippingCost = 0.0;
        if (finalPrice < 50) {
            shippingCost = 2.99;
        }

        // Precio definitivo

        System.out.println(finalPrice + shippingCost);
    }

}

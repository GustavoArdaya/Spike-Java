package com.refactoring.replacemethod.good;

public class Product {

    double price;
    int quantity;
    double discount;
    double shipping;

    // constructores

    // metodos

    // tostring

    public double calculatePrice(){
        return new ProductPriceCalculator(this).calculatePrice();
    }

    // getter y setter
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getDiscount() {
        return discount;
    }
    public double getShipping() {
        return shipping;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public void setShipping(double shipping) {
        this.shipping = shipping;
    }

}

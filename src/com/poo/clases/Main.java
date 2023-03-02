package com.poo.clases;

import com.poo.herencia.SmartPhone;
import com.poo.herencia.SmartWatch;

public class Main {
    public static void main(String[] args) {

        SmartPhone iphone10 = new SmartPhone("iphone10", "A11 Bionic", 1.5, 3, 64, 5.8, "5G", 7.0);
        SmartWatch cualquiera = new SmartWatch();

        System.out.println(iphone10.toString());
        System.out.println(cualquiera.toString());
    }
}

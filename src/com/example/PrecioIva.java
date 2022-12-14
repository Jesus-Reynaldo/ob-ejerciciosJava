package com.example;

public class PrecioIva {
    public static void main(String[] args) {
        double price= priceIva(100.6,0.13);
        System.out.println(price);
    }

    static double priceIva(double price, double iva) {
        return price*iva+price;
    }

}

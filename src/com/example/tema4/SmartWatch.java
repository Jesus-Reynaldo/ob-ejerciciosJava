package com.example.tema4;

public class SmartWatch extends SmartDevice{
    double pulgadas;
    String conectividad;

    public SmartWatch() {
        super();
    }

    public SmartWatch(double pulgadas, String conectividad) {
        this.pulgadas = pulgadas;
        this.conectividad = conectividad;
    }

    public SmartWatch(String marca, String modelo, String color, double pulgadas, String conectividad) {
        super(marca, modelo, color);
        this.pulgadas = pulgadas;
        this.conectividad = conectividad;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "pulgadas=" + pulgadas +
                ", conectividad='" + conectividad + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

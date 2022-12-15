package com.example.tema4;

public class SmartPhone extends SmartDevice{
    String sistemaOperativo;
    String procesador;
    int memoria;
    int ram;
    public SmartPhone(){
        super();
    }

    public SmartPhone(String sistemaOperativo, String procesador, int memoria, int ram) {
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
        this.memoria = memoria;
        this.ram = ram;
    }

    public SmartPhone(String marca, String modelo, String color, String sistemaOperativo, String procesador, int memoria, int ram) {
        super(marca, modelo, color);
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
        this.memoria = memoria;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "sistemaOperativo='" + sistemaOperativo + '\'' +
                ", procesador='" + procesador + '\'' +
                ", memoria=" + memoria +
                ", ram=" + ram +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

package com.example;

public class ConcatenarTexto {
    public static void main(String[] args) {
        String[] nombres = {"Ruben", "Alejandra", "Katherine", "Lucia"};
        String cadena="";
        for(String nombre : nombres){
            cadena+=nombre+" ";
        }
        System.out.println(cadena);
    }
}

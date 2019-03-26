package com.company;


import java.util.Random;

public class Diccionario {

    String[] palabras = {"Hola", "Adios", "Ordenador", "Arroz", "Pena", "Comida", "Esternocleidomastoideo", "Supercalifragilisticoespialidoso", "hoy"};

    String obtenerPalabra(){

        int random = new Random().nextInt(palabras.length);
        return palabras[random].toLowerCase();
    }
}

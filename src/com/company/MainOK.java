package com.company;

import java.util.Scanner;

public class MainOK {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String[] diccionario = {"Hola", "Adios", "Ordenador"};
        int numRandon = (int) Math.round(Math.random());
        String palabra = diccionario[numRandon].toLowerCase();

        boolean[] descubiertas = new boolean[palabra.length()];  // char[] desc = {'H','_','L','_'}

        System.out.println("BIENVENIDO AL AHORCADO");
        System.out.println();
        System.out.println("Adivina una letra");
        boolean resultado = false;
        int intentos = 6;
        int contador_palabra = 0;
        // printa los guines iniciales
        for ( int j = 0; j < palabra.length(); j++) {
            if (descubiertas[j]) {
                //acierto = true;
                System.out.print(palabra.charAt(j));
            }
            else {
                System.out.print("-");
            }
        }
        System.out.println();


        char letra = sc.nextLine().charAt(0);
        System.out.println();
       // System.out.println("Tienes " + intentos + " intentos");

        while (intentos > 0 && palabra.length() != contador_palabra) {

            boolean descubierta = false;

            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    descubiertas[i] = true;
                    descubierta = true;
                    contador_palabra++;
                }
            }

            if(descubierta == false) {
                intentos--;
            }

            System.out.println();

            for ( int j = 0; j < palabra.length(); j++) {
                if (descubiertas[j]) {
                    //acierto = true;
                    System.out.print(palabra.charAt(j));
                }
                else {
                    System.out.print("-");
                }
            }

            System.out.println();
            System.out.println("Tienes " + intentos + " intentos");
            System.out.println();
            letra = sc.nextLine().charAt(0);
            System.out.println();

        }

        for (int i = 0; i < palabra.length(); i++) {
            if (descubiertas[i] == false){
                resultado = true;
            }
        }

        if (resultado == true){
            System.out.println("Has perdido");
            return;
        }
        else {
            System.out.println("Has ganado");
            return;
        }

        // resultado = false
        // Si hay alguna false resultado = has perdido TRUE
        //  Si resultado = true has perdido
        // else has ganado



        // for() hacer un for de descubiertas y ver si hay algun false

        // if( habia algun false)

    }
}

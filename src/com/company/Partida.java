package com.company;

import java.util.Scanner;

public class Partida {
    Scanner sc = new Scanner(System.in);
    boolean resultado = false;
    int intentos = 6;

    void mostrarBienvenida(){
        System.out.println("BIENVENIDO AL AHORCADO");
        System.out.println();
        System.out.println("Adivina una letra");
    }

    char pedirLetra(){
        char letra = sc.nextLine().charAt(0);
        System.out.println();
        return letra;
    }

    void mostrarIntentos(boolean descubierta){

        if(descubierta == false) {
            intentos--;
        }
        System.out.println("Tienes " + intentos + " intentos");

    }

    void mostrarResultado(boolean resultado){
        if (resultado == true){
            System.out.println();
            System.out.println("Has perdido ohhh");
        }
        else {
            System.out.println();
            System.out.println("Has ganado yu heeee");
        }
    }

}

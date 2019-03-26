package com.company;

public class PalabraSecreta {

    String palabra;

    boolean[] descubiertas;  //{true, false, true}
    int contadorLetrasAdivinadas = 0;

    void crearHuecos(String palabraRandom){
        descubiertas = new boolean[palabraRandom.length()];
        palabra = palabraRandom;
    }

    void mostrarAdivinadas(){
        for ( int j = 0; j < palabra.length(); j++) {
            if (descubiertas[j]) {
                System.out.print(palabra.charAt(j));
            }
            else {
                System.out.print("-");
            }
        }
        System.out.println();
    }

    boolean comprobarLetra(char letra){

        boolean descubierta = false;

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                descubiertas[i] = true;
                descubierta = true;
                contadorLetrasAdivinadas++;
            }
        }
        return descubierta;
    }

    boolean comprobarAdivinada(){
        boolean resultado = false;
        for (int i = 0; i < palabra.length(); i++) {
            if (descubiertas[i] == false){
                resultado = true;
            }
        }

        return resultado;
    }
}

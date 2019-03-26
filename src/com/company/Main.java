package com.company;

public class Main {

    public static void main(String[] args) {
        Diccionario diccionario = new Diccionario();

        String palabraRandom = diccionario.obtenerPalabra();

        PalabraSecreta palabraSecreta = new PalabraSecreta();
        palabraSecreta.crearHuecos(palabraRandom);

        Partida partida = new Partida();
        partida.mostrarBienvenida();


        palabraSecreta.mostrarAdivinadas();
        char letra;


        while (partida.intentos > 0 && palabraRandom.length() != palabraSecreta.contadorLetrasAdivinadas) {

            letra = partida.pedirLetra();
            boolean descubierta = palabraSecreta.comprobarLetra(letra);

            palabraSecreta.mostrarAdivinadas();

            partida.mostrarIntentos(descubierta);


       }
        boolean resultado = palabraSecreta.comprobarAdivinada();

        partida.mostrarResultado(resultado);
    }
}


/*
    Parametros ()   -> se envian   y    se reciben
    Return          -> se retorna  y    se recoge (=)
 */
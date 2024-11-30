package com.mycompany.soproject;

public class Main {

    public static void main(String[] args) {
        int numeroDeFilosofos = 5;
        Garfos garfos = new Garfos(5);

        // Cria e inicia os threads dos filósofos
        for (int i = 0; i < numeroDeFilosofos; i++) {
            Thread filosofo = new Thread(new Filosofos(i, garfos));
            filosofo.start();
        }
    }
}

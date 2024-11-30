package com.mycompany.soproject;

import java.util.concurrent.Semaphore;

public class Filosofos implements Runnable {

    private final int philoNumber;
    private final Garfos garfos;  

    public Filosofos(int philoNumber, Garfos garfos) {
        this.philoNumber = philoNumber;
        this.garfos = garfos;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int tempo = (int) (Math.random() * 1000);
                pense(tempo);

                garfos.pegarGarfo(philoNumber);
                garfos.pegarGarfo((philoNumber + 1) % 5);

                tempo = (int) (Math.random() * 1000);
                coma(tempo);

                garfos.soltarGarfo(philoNumber);
                garfos.soltarGarfo((philoNumber + 1) % 5);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Filósofo " + philoNumber + " foi interrompido.");
        }
    }

    private void pense(int tempo) throws InterruptedException {
        System.out.println("Filósofo " + philoNumber + " está pensando.");
        Thread.sleep(tempo);
    }

    private void coma(int tempo) throws InterruptedException {
        System.out.println("Filósofo " + philoNumber + " está comendo.");
        Thread.sleep(tempo);
    }
}

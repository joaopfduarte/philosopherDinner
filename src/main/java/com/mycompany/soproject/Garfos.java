package com.mycompany.soproject;

import java.util.concurrent.Semaphore;

public class Garfos {

    private final Semaphore[] garfo;

    public Garfos(int quantidadeDeGarfos) {
        garfo = new Semaphore[quantidadeDeGarfos];
        for (int i = 0; i < quantidadeDeGarfos; i++) {
            garfo[i] = new Semaphore(1); 
        }
    }

    
    public void pegarGarfo(int indice) throws InterruptedException {
        garfo[indice].acquire(); 
    }

 
    public void soltarGarfo(int indice) {
        garfo[indice].release(); 
    }
}

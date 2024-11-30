
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.soproject;
import java.util.concurrent.Semaphore;


/**
 *0
 * @author Aluno
 */
public class Filosofos implements Runnable{
    
    int philoNumber;
    Semaphore semaphore = new Semaphore(5);
    final static int tempoMaximo = 100;
    
    public Filosofos (int i){
        this.philoNumber = i;
    }

    Filosofos(String string, Mesa mesa, int filosofo) {
    }
    
    public Thread garfo(){
        Thread philoI = new Thread();
        Thread philoII = new Thread();
        Thread philoIII = new Thread();
        Thread philoIV = new Thread();
        Thread philoV = new Thread();
        return switch (this.philoNumber) {
            case 1 -> philoI;
            case 2 -> philoII;
            case 3 -> philoIII;
            case 4 -> philoIV;
            default -> philoV;
        };
    }

    @Override
    public void run() {
        
        int tempo = 0;
        
        while (true){
            tempo = (int) (Math.random() * Filosofos.tempoMaximo);
            pense(tempo);
            pegarGarfoE();
            pegarGarfoD();
            tempo = (int) (Math.random() * Filosofos.tempoMaximo);
            comer(tempo);
            
        }
    }
    
    public void pense(int tempo){
        
    }
    
    public void coma(int tempo) {
        
    }
    
    public void pegarGarfoE(int l){
        
    }
    
    public void pegarGarfoD(int r){
        
    }

    public void largarGarfoE(int l){
        
    }
    
    public void largarGarfoD(int r){
        
    }

}

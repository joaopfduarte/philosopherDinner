package com.mycompany.soproject;

import java.util.Date;
import java.io.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;

public class SoProject {

   
   public static void main (String[] args)
   {
      Mesa mesa = new Mesa ();
      for (int filosofo = 0; filosofo < 5; filosofo++)
      {
         new Filosofos("Filosofo_" + filosofo, mesa, filosofo).run();
      }
   }

}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Truong Nguyen
 */
public class MyThread implements  Runnable{

    @Override
    public void run() {
       for(int i = 0;i< 10;i++){
           System.out.println(i + " ");
           try {
               Thread.sleep(500);
           } catch (InterruptedException ex) {
              ex.printStackTrace();
           }
       }
    }
    public static void main(String[] args) {
        // goi luong 1
        Thread t1 = new Thread(new MyThread());
        t1.start();
        // goi luong 2
        Thread t2 = new Thread(new MyThread());
        t2.start();
        
    }
  
    
}

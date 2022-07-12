/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3lab4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Truong Nguyen
 */
public class EventThread extends  Thread{
    public void run(){
        for(int i = 0;i<= 10;i++){
            if(i%2==0)
            System.out.print(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(OddThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

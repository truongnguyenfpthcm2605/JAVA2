/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daluong;

/**
 *
 * @author Truong Nguyen
 */
public class NacDanh {

    public static void main(String[] args) {
        // tao 
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; true; i++) {
                    System.out.print("Hello My Name is Truong ");
                    try {
                        Thread.sleep(1000); // thoi gian nghi
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }.start(); 
        // ket thuc
        // bat dau cai thu 2
        new Thread(){
             public void run() {
                for (int i = 0; true; i++) {
                    System.out.print(" My Lover  ");
                    try {
                        Thread.sleep(1000); // thoi gian nghi
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }.start();
        // ket thuc cai thu 2

    }
}

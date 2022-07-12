/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaLuong;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyRunnable implements Runnable {

    @Override
    public void run() { // method dong bo hoa
        synchronized (this) { // dong bo hoa khoi
            for (int i = 0; i < 10; i++) {
                System.out.print(i + ", ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }

        }
    }
    public static void main(String[] args) {
        MyRunnable run = new MyRunnable();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        t1.start();
        t2.start();
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaLuong;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Truong Nguyen
 */
public class HienTuongDeadLock {

    public static void main(String[] args) {
        final String taiNguyen1 = "taiNguyen1";
        final String taiNguyen2 = "taiNguyen2";
        Thread t1 = new Thread() {
            @Override
            public void run() {
                synchronized (taiNguyen1) {
                    System.out.println("t1 khoa tai nguyen 1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {

                    }
                    synchronized (taiNguyen2) {
                        System.out.println("t1 khoa tai nguyen 2");
                    }
                }
            }

        };
        t1.start();
        Thread t2 = new Thread() {
            @Override
            public void run() {
                synchronized (taiNguyen1) {
                    System.out.println("t2 khoa tai nguyen 2");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {

                    }
                    synchronized (taiNguyen2) {
                        System.out.println("t2 khoa tai nguyen 1");
                    }
                }
            }

        };
        t2.start();
    }
}

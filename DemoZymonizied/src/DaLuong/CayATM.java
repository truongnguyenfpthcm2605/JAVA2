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
public class CayATM {
    int tk = 1000;
    public synchronized void rutTien(int m){
        System.out.println("Bạn đang rút tiền");
        if(tk < m){
            System.out.println("Không đủ tiền rút");
            try {
                wait(); // nghi doi 
            } catch (InterruptedException ex) {
             
            }
        }
        tk=tk-m ;
        System.out.println("Rút tiền thanh công la : " + tk);
    }
    
    public synchronized void napTien(int m){
        System.out.println("Me đang nạp tiền");
        tk =tk+m;
        System.out.println("Tiên đã cộng vao số dư là : " + tk);
        System.out.println("Me đã nạp xong rút đi chơi gái đi con");
        notify();// thuc thi lai phuong thuc da nghi
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaLuong;

/**
 *
 * @author Truong Nguyen
 */
public class MeThuongCon {
    public static void main(String[] args) {
        CayATM c = new CayATM();
        Thread t1 = new Thread(){
            @Override
            public void run(){
                c.rutTien(1500);
            }
        };
        t1.start();
        Thread t2 = new Thread(){
            @Override
            public void run(){
                c.napTien(300000);
            }
        };
        t2.start();
        
    }
}

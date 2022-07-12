/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daluong;

/**
 *
 * @author Truong Nguyen
 */
public class MyRunnable  implements  Runnable{

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
    public static void main(String[] args) {
        // cach 1
        DaLuong dl = new DaLuong();
        dl.start();
        // cach 2
        Thread th = new Thread(new MyRunnable());
        th.start();
        
        
     
    }
    
}

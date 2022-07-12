/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daluong;



/**
 *
 * @author Truong Nguyen
 */
public class DaLuong extends  Thread{


    
   @Override
   public void run(){
       for (int i = 0; i <= 10; i++) {
           System.out.print(i+ " ");
           try {
               Thread.sleep(1000); // thoi gian nghi
           } catch (InterruptedException ex) {
               ex.printStackTrace();
           }
       }
   }
    public static void main(String[] args) throws InterruptedException {
        DaLuong dl = new DaLuong();
        dl.start();
        dl.join();
        
        DaLuong dl2 = new DaLuong();
        dl2.start();
        
    }
    
}

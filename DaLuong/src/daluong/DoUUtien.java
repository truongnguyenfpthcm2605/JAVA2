/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daluong;

/**
 *
 * @author Truong Nguyen
 */
public class DoUUtien extends  Thread{
    @Override
    public void run(){
        System.out.println("dang chay : " + Thread.currentThread().getName());
        System.out.println("Co do uu tien : " + Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        DoUUtien do1 = new DoUUtien();
        do1.setPriority(MIN_PRIORITY);
        DoUUtien do2 = new DoUUtien();       
        do2.setPriority(MAX_PRIORITY); // xet do uu tien
        do1.start();
        do2.start();
    }
}

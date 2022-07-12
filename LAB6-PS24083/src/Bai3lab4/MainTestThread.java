/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3lab4;

/**
 *
 * @author Truong Nguyen
 */
public class MainTestThread {
    public static void main(String[] args) throws InterruptedException {
        OddThread odd = new OddThread();
        odd.start();
        odd.join(); // uu tien truoc
        EventThread even = new EventThread();
        even.start();
    }
}

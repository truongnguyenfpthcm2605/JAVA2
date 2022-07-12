/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newfile;

/**
 *
 * @author Truong Nguyen
 */
public class DemoNgoaiLE2 {

    static void method()  throws NullPointerException{

        try {
            throw new NullPointerException("loi");
        } catch (NullPointerException e) {
            System.out.println("loi" + e); // bat loi
            throw e; // nem loi
        }

    }

    public static void main(String[] args) {
        try {
              method();
        } catch (NullPointerException e) {
            System.out.println("loi"+ e);
        }
        System.out.println("Continue");

    }
}

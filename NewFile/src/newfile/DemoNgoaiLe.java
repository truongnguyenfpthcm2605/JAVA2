/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newfile;

/**
 *
 * @author Truong Nguyen
 */
public class DemoNgoaiLe {
// xu ly loi nem ra trong phuong thuc
    static void validate() {
        try {
            if (true) {
                throw new ArithmeticException("Error");
            } else {
                System.out.println("Happy");
            }
        } catch (ArithmeticException e) {
            System.out.println("Xu ly loi nem ra");
        }
    }

    public static void main(String[] args) {

        validate();

        System.out.println("tiep tuc chuong trinh");
    }

}

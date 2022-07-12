/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide8genneric;

/**
 *
 * @author Truong Nguyen
 */
public class Sumation {

    private int sum;

    <T extends Number> Sumation(T size) {
        sum = 0;
        for (int i = 0; i <= size.intValue(); i++) {
            sum += i;
        }
    }

    public int getSum() {
        return sum;
    }

    public static void main(String[] args) {
        Sumation obj = new Sumation(4.0);
        System.out.println("Sum of 1->4 is " + obj.getSum());
    }
}

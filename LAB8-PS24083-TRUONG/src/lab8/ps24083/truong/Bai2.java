/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8.ps24083.truong;

import java.util.ArrayList;

/**
 *
 * @author Truong Nguyen
 */
public class Bai2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i<= 10;i++){
            arr.add(i);
        }
        for (Integer integer : arr) {
            System.out.println(integer);
        }
    }
}

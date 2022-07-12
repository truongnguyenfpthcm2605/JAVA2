/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8.ps24083.truong.bai3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Truong Nguyen
 */
public class ss<T> {
     protected  List<T> list = new ArrayList<>();
    public void add(T a){
        list.add(a);
    }
    public void get(){
        for (T t : list) {
            System.out.println(t);
            
        }
    }
    public static void main(String[] args) {
        ss<Integer> list = new ss();
        list.add(5);
         list.add(6);
          list.add(7);
        
        list.get();
    }
}

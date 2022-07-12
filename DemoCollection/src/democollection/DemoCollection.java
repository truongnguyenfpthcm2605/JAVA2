/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package democollection;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Truong Nguyen
 */
public class DemoCollection {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6,5,76,77,56);
        
        Collections.sort(list, Collections.reverseOrder()); // sap xep giam theo so nguyen
        list.forEach(v -> System.out.println(v));
        System.out.println("max = "  + Collections.max(list)); // so lon nhat
        System.out.println("min ="+ Collections.min(list)); // so nho nhat
        Collections.shuffle(list);
        list.forEach(v -> System.out.println(v));
        System.out.println("so lan xuat hien cua 5 : " + Collections.frequency(list, 5));// so lan xuat hien
    }
    
}
class phanSo implements  Comparable<phanSo>{

    @Override
    public int compareTo(phanSo o) {
      return 0;
    }
    
}

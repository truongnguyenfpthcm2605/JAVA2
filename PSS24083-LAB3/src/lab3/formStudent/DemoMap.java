/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3.formStudent;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Truong Nguyen
 */
public class DemoMap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Student> map = new HashMap<>();
        Student sv = new Student();
        try {
            for (int i = 0; i < 3; i++) {
                System.out.print("nhap vao ten :");
                sv.name = sc.nextLine();
                System.out.print("nhap vao diem:");
                sv.marks = Double.parseDouble(sc.nextLine());
                System.out.print("nhap vao nganh");
                sv.major = sc.nextLine();
                map.put(sv.name, sv);

            }
        } catch (NumberFormatException e) {
        }
        Set<String> set =map.keySet();
        for (String string : set) {
            sv = map.get(string);
            System.out.println(string);
            System.out.println(sv.getName());
                System.out.println(sv.getMarks());
            
        }
            
        }

    }
   
    





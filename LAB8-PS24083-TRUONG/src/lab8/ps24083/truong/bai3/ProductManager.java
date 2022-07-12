/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8.ps24083.truong.bai3;

/**
 *
 * @author Truong Nguyen
 */
public class ProductManager {

    public static void main(String[] args) {
        Product p1 = new Product("iphone9", 35.678);
        Product p2 = new Product("Samsung Galaxy S22 Ultra", 30.678);
        ProDuctDAO dao = new ProDuctDAO();
        dao.add(p1);
        dao.add(p2);
      //  dao.store("D:\\SUMMER2022\\MOB1023JAVA2\\Lab8.txt");
        ProDuctDAO dao2 = new ProDuctDAO();
        dao2.load("D:\\SUMMER2022\\MOB1023JAVA2\\Lab8.dat");
       
        try {
            Product p = dao2.find("iphone89");
            System.out.println(">Name: " + p.name);
            System.out.println(">Price: " + p.price);
        } catch (Exception e) {
            System.out.println("looix");
           
        }

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ps24083.model;

import java.io.Serializable;

/**
 *
 * @author Truong Nguyen
 */
public class Employee implements  Serializable{
    private String maSv;
    private String name;
    private int Age;
    private String email;
    private double salary;
    private String img;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Employee(String maSv, String name, int Age, String email, double salary, String img) {
        this.maSv = maSv;
        this.name = name;
        this.Age = Age;
        this.email = email;
        this.salary = salary;
        this.img = img;
    }

    public Employee() {
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

   
    
    
    
}

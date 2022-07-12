/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de1;

import java.io.Serializable;

/**
 *
 * @author Truong Nguyen
 */
public class User implements  Serializable{
    private String name;
    private int age;
    private  boolean gender;
   

    public User(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

 
    
    



}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8.ps24083.truong.bai3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Truong Nguyen
 * @param <Enity>
 */
 abstract  public class Dao<Enity> {
    protected  List<Enity> list = new ArrayList<>();
    public void add(Enity a){
        list.add(a);
    }
    public void remove(Enity a){
        list.remove(a);
    }
    abstract  public void update(Enity a);
    abstract public Enity find(Serializable id);
    
    public List<Enity> getList(){
        return list;
    }
    // doc file object
    public void store(String path){
        try {
            FileInputStream input = new FileInputStream(path);
            ObjectInputStream op = new ObjectInputStream(input);
            list =  (List<Enity>) op.readObject();
            op.close();
            input.close();
        } catch (Exception e) {
        }
    }
    // ghi file object
    public void load(String path){
        try {
            FileOutputStream output = new FileOutputStream(path);
            ObjectOutputStream op = new ObjectOutputStream(output);
            op.writeObject(list);
            op.close();
            output.close();
        } catch (Exception e) {
        }
    }
    public void xuat(){
        for (Enity enity : list) {
            System.out.println(enity);
        }
    }
}

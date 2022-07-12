/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

import java.io.Serializable;

/**
 *
 * @author Truong Nguyen
 */
public class Staff  implements  Serializable{
    private String name;
    private double  salary;

    public Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Staff() {
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff{" + "name=" + name + ", salary=" + salary + '}';
    }
    
    
    
}

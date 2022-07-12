/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;



/**
 *
 * @author Truong Nguyen
 */
public class Product {
    private  String name;
    private  double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getImportTax(){
        return getPrice()*0.1;
    }

    
    public void outputs() {
        System.out.printf("%-20s %-20.2f %.2f\n",getName(),getPrice(),getImportTax());
    }
    
    
    
}

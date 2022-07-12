/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide8genneric;

/**
 *
 * @author Truong Nguyen
 */
public class MethodGen {
    public  static<T extends Number> void List(T[] ds){
        for (T d : ds) {
            System.out.println(d + " ");
            
        }
    }
   
    public static void main(String[] args) {
        Integer[] ds = {1,2,3,4,5,6,7,8};
        List(ds);
        String[] list = {"a","b","c","d"};
       
        
                
    }
}

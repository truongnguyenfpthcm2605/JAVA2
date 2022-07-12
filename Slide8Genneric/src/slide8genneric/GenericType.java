/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide8genneric;

/**
 *
 * @author Truong Nguyen
 */
public class GenericType<T> {
    private T t;

    public GenericType(T t) {
        this.t = t;
    }

    public GenericType() {
    }
    
    public T get(){
        return this.t;
    }
    public void set(T t1){
        this.t = t1;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide8genneric;

/**
 *
 * @author Truong Nguyen
 */
interface Containment<T> {

    boolean contains(T obj);
}

public class MyClass<T> implements Containment<T> {

    T[] arrayRef;

    public MyClass(T[] arr) {
        arrayRef = arr;
    }

    @Override
    public boolean contains(T obj) {
        for (T x : arrayRef) {
            if (x.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Integer x[] = {1, 2, 3};
        MyClass<Integer> ob = new MyClass<Integer>(x);
        Integer a = 29;
        if (ob.contains(a)) {
            System.out.println(a + " in array");
        } else {
            System.out.println(a + " NOT in array");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide8genneric;

/**
 *
 * @author Truong Nguyen
 * @param <T>
 * @param <S>
 */
public class Gen2ThamSo<T, S> {
    private T first;
    private  S second;

    public Gen2ThamSo(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }
    public static void main(String[] args) {
        Gen2ThamSo<Integer,String> gen1 = new Gen2ThamSo<>(1,"truong");
        System.out.println("one : " + gen1.getFirst() +  "Two :  "+ gen1.getSecond() );
        
             Gen2ThamSo<String,String> gen2 = new Gen2ThamSo<>("Ngân","truong");
        System.out.println("one : " + gen2.getFirst() +  "Two :  "+ gen2.getSecond() );
    }
    
}

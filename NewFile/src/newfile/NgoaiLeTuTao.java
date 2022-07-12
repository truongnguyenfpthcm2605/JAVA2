/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newfile;

/**
 *
 * @author Truong Nguyen
 */
public class NgoaiLeTuTao extends  Exception{
    private int age ;
     NgoaiLeTuTao(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "may choi tao ha "+ age;
    }
    static void tinhToan(int a) throws  NgoaiLeTuTao{
        if(a>10) 
            throw new  NgoaiLeTuTao(a);
        else 
            System.out.println("exit");
    }
    public static void main(String[] args) {
        try {
             tinhToan(11);
        } catch (NgoaiLeTuTao e) {
            System.out.println("Ngoai le tu tao\n " + e);
        }
        System.out.println("tiep tuc");
    }
    
    
}

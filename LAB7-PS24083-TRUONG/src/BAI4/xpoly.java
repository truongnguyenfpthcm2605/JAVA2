/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI4;

@interface  Hibernate_table{
    String value();
}
@interface  Hibernate_field{
    String value();
}
@interface  Hibernate_method{
    String value();
}
@Hibernate_table("đây la class")
public class xpoly {
@Hibernate_method("đây la hàm chạy")
    public static boolean isCardNumber(String number) {
        String s = number;
        int n = Integer.parseInt(s);
        int tong = 0;
        while (n > 0) {
            int a = n % 10;
            n = n / 10;
            tong += a;
        }
        if(tong % 2 ==0){
            return true;
        }
        return false;
    }
}

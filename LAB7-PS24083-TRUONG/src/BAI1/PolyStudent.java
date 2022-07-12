/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;

import static java.lang.System.out;

/**
 *
 * @author Truong Nguyen
 */
public class PolyStudent {
    public String fullName;
    public Career career;
    
    public void print(){
        System.out.println(">FullName : " + this.fullName);
        switch(this.career){
            case UDPM -> out.println(" > Crareer  : Ứng dụng phần mềm  ");
            case TKTW -> out.println(" > Career : Thiết kê trang web");
            case LTDĐ -> out.println(" > Crareer  : Lập trình di động ");
            case TKĐH -> out.println(" > Career : Thương mại điện tư");
            default -> out.println(" > Career : Các nganh khác ");
        }
    }
    public static void main(String[] args) {
        PolyStudent poly = new PolyStudent();
        
        poly.fullName = "Nguyễn Văn Trường";
        poly.career  = Career.UDPM;
        poly.print();
    }
}

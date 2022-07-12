/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daluong;

/**
 *
 * @author Truong Nguyen
 */
public class Information {

    public static void main(String[] args) {
        DaLuong dl1 = new DaLuong();
        dl1.start();
        Thread t = Thread.currentThread();
        System.out.println("Định Danh " + t.getId());
        System.out.println("Tên" + t.getName());
        System.out.println("Độ Ưu tiên" + t.getPriority());
        System.out.println("Trạng Thái" + t.getState());
        System.out.println("Đang Hoạt Động " + t.isAlive());
        System.out.println("Số Lượng Thread " + t.activeCount());
    }
}

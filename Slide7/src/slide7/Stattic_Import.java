/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide7;

import static java.lang.Math.*;
import static java.lang.System.*;

/**
 *
 * @author Truong Nguyen
 */
public class Stattic_Import {

    @Deprecated // cam bao lac hậu

    public static void run() {
        out.println("hàm run đã lỗi thời nên hạn chế dùng");
    }

    public static void main(String[] args) {
        double x = sqrt(100);
        double y = pow(2, 3);
        out.println("x : " + x + " y : " + y);
        //  @SuppressWarnings("Lạc Hậu Lỗi thời")
        run();
    }
}

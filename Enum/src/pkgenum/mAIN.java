/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgenum;

/**
 *
 * @author Truong Nguyen
 */
public class mAIN {

    public static void main(String[] args) {
        Transports p;
        // gan enum
        p = Transports.CAR;
        System.out.println(p);
        // so sanh enum
        if (p == Transports.TRAIN) {
            System.out.println("Hợp Lý");
        } else {
            System.out.println("Không Hợp lý");
        }
        // case Enum
        switch (p) {
            case CAR:
                System.out.println("Có Enum đó car");
                break;
            case TRAIN:
                System.out.println("Có Enum đó train");
                break;
            default:
                System.out.println("Không có Enum đó");
        }
        // tao mang Enum
        Transports e[] = Transports.values();
        // xuat mang Enum
        for (Transports transports : e) {
            System.out.println(transports);
        }

        // lay 1 gia tri Enum
        Transports a = Transports.valueOf("AIRPLANE");
        System.out.println(a);

        // LAY VI TRI TRONG eNUM BẮT ĐẦU LÀ 0 NHƯ MẢNG
        System.out.println("Vi tri cua a : " + a.ordinal());

        // KIEM TRA HẰNG SỐ ĐỨNG TRƯỚC HAY ĐỨNG SAU
        Transports b = Transports.valueOf("CAR");

        System.out.println("Hang số a có đứng trước hằng số b không : " + a.compareTo(b));

        // su dung Annotation
    }
}

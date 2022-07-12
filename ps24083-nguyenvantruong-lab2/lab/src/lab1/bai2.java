package lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class bai2 {

    static Scanner sc = new Scanner(System.in);
    static Product sp;
    static ArrayList<Product> dssp = new ArrayList<>();
    static Product chon;
    static void menu() {
        int nhap;
        do {
            System.out.print("Chọn chức năng");
            nhap = Integer.parseInt(sc.nextLine());
            chon = new Product();
            chon.select();
            System.out.println();
            switch (nhap) {
                case 1:
                    input();
                    break;
                case 2:
                    output();
                    break;
                default:
                    System.out.println("Không có chức năng này");
                    break;
            }
        } while (true);
    }
//    static 

    static Product nhap_one_product() {
        System.out.print("Nhập tên sp :");
        String name = sc.nextLine();
        System.out.print("Nhập giá sp :");
        double price = Double.parseDouble(sc.nextLine());
        if(name.equalsIgnoreCase("Van hoa")){
            sp = new NoTaxProduct(name, price);
        }else
        sp = new Product(name, price);
        sp.insert();
        System.out.println();
        return sp;
    }

    static void input() {
        int i = 0;
        do {
            nhap_one_product();
            dssp.add(sp);
            i++;
        } while (i < 5);
    }

    static void output() {
        System.out.printf("%-20s|%-15s|%-15s\n", "Name", "Price", "Tax");
        for (Product sp : dssp) {
            sp.output();
        }
    }

    public static void main(String[] args) {
        menu();
    }
}

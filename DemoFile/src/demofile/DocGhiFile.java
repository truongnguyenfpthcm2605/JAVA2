/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demofile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


import java.io.IOException;

/**
 *
 * @author Truong Nguyen
 */
public class DocGhiFile {

    public static void main(String[] args) throws FileNotFoundException, IOException {
                try ( // ghi du lieu nhi phan byte
        // tao luông ghi
                FileOutputStream fos = new FileOutputStream("D:\\SUMMER2022\\MOB1023 -  JAVA2\\demofile.txt")) {
            String text = "Nguyễn Văn Trường , Phạm Thị Ngọc Ngân";
            byte[] textByte = text.getBytes(); // chuyen String thanh byte moi ghi dc , do file ghi kieu byte
            fos.write(textByte);
            // dong file
        }

        // doc file
        try {
                    FileInputStream fis = new FileInputStream("D:\\SUMMER2022\\MOB1023 -  JAVA2\\demofile.dat");
            int c;
            while((c= fis.read()) !=-1){
                System.out.print((char)c);
                
            }
        
        } catch (Exception e) {
        }
                
        
    }
}

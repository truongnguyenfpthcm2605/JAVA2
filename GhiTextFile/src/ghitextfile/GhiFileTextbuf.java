/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ghitextfile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Truong Nguyen
 */
public class GhiFileTextbuf {
    public static void main(String[] args) throws IOException {
         File  f = new File("D:\\SUMMER2022\\MOB1023JAVA2\\ghifile.txt");
         FileWriter fw = new FileWriter(f);
         BufferedWriter bfw = new BufferedWriter(fw);
         bfw.write("Yeu bes ngan qua");
         bfw.flush(); // xoa luong
         bfw.close();
    }
}

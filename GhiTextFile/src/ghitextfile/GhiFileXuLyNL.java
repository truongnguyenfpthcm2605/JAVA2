/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ghitextfile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Truong Nguyen
 */
public class GhiFileXuLyNL {
    public static void main(String[] args) {
         File  f = new File("D:\\SUMMER2022\\MOB1023JAVA2\\ghifile.txt");
         try {
            FileWriter fw = new FileWriter(f);
             BufferedWriter bfw = new BufferedWriter(fw);
             bfw.write("Hom nay la thu 4");
             bfw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
         
    }
}

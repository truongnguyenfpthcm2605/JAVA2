/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ghitextfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Truong Nguyen
 */
public class ReadTextFile {
    public static void main(String[] args) throws FileNotFoundException, IOException {
         File  f = new File("D:\\SUMMER2022\\MOB1023JAVA2\\ghifile.txt");
         FileReader fd = new FileReader(f);
         int c = fd.read();
         while(c != -1){
             System.out.println((char) c);
             c = fd.read();
             
         }
         fd.close();
    }
}

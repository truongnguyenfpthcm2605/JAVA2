/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ghitextfile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Truong Nguyen
 */
public class GhiTextFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      File  f = new File("D:\\SUMMER2022\\MOB1023JAVA2\\ghifile.txt");
        FileWriter fw = new FileWriter(f);
        fw.write("hom nay la thu 2 \n");
        fw.write("hom nay la thu 3");
        fw.flush();
        fw.close();
        
    }
    
}

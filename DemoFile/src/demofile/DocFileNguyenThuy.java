/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demofile;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Truong Nguyen
 */
public class DocFileNguyenThuy {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // ghi file
        // tao luong ra 
        FileOutputStream fout = new FileOutputStream("D:\\SUMMER2022\\MOB1023 -  JAVA2\\Demoghifile.txt");
        DataOutputStream dout = new DataOutputStream(fout);
        final int number = 5;
        fout.write(number);
        for(int i = 1;i<= number;i++)
            dout.writeInt(i);
            dout.writeUTF("Hello");
            dout.writeDouble(3.14);
            dout.close();
            fout.close();
            
            // doc file 
            FileInputStream fis = new FileInputStream("D:\\SUMMER2022\\MOB1023 -  JAVA2\\Demoghifile.txt");
            DataInputStream in = new DataInputStream(fis);
            int items = in.readInt();
            for(int i = 0;i<= items;i++){
                int n = in.readInt();
                System.out.println(n + " ");
            }
            System.out.println(in.readUTF());
            System.out.println(in.readDouble());
            in.close();
            
         
            
        
        
    }
}

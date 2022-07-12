/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProcessingFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Truong Nguyen
 */
public class XFile {

    public static byte[] read(String pathname) throws FileNotFoundException, IOException {
        FileInputStream input = new FileInputStream(pathname);
        int length = input.available(); // dung luong cua file available
        byte[] data = new byte[length];
        input.read(data);
        input.close();
        return data;// trả va mảng kieu byte

    }

    public static void write(String pathname, byte[] data) throws FileNotFoundException, IOException {
        FileOutputStream output = new FileOutputStream(pathname);
        output.write(data);
        output.close();

    }

    // doc ghi file kieu object . 
    public static Object readObj(String path) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream oss = new ObjectInputStream(new FileInputStream(path));
        Object op = oss.readObject();
        oss.close();
        return op;
    }

    public static void writeObj(String path, Object op) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path));
        out.writeObject(op);
        out.close();
    }

    public static void main(String[] args) {
        // doc ghi file kiêu nhị phân
        try {

            byte[] data = read("D:\\SUMMER2022\\MOB1023JAVA2\\filelab5.gif");
            XFile.write("D:\\SUMMER2022\\MOB1023JAVA2\\filelab51.gif", data);
        } catch (Exception e) {
            e.printStackTrace();
        }
     
        try {
            List<Student> list = new ArrayList<>();
            list.add(new Student("truong", 9, "cntt"));
            list.add(new Student("truong", 10, "cntt"));
            list.add(new Student("truong", 8, "cntt"));
            list.add(new Student("truong", 6, "cntt"));
            writeObj("D:\\SUMMER2022\\MOB1023JAVA2\\ghifile.txt", list);
            list = (List<Student>) readObj("D:\\SUMMER2022\\MOB1023JAVA2\\ghifile.txt");
            for (Student student : list) {
                System.out.println(student.toString());
            }
        } catch (Exception e) {
        }

    }

}
